use std::fs;

fn main() -> Result<(), std::io::Error> {
    let directory_path = "./input";

    // List files in the directory.
    let entries = fs::read_dir(directory_path)?;

    // Iterate over all the files in the directory.
    for entry in entries {
        let entry = entry?;
        if entry.file_type().map(|ft| ft.is_file()).unwrap_or(false) {
            let file_path = entry.path();
            println!("{:?}", file_path.extension().unwrap());
            // match the file type
            // if its xml send to xml handler
            // if its java sent to java handler
        }
    }

    Ok(())
}
