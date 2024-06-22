# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2024, Konrad Weihmann
python do_cargo_fixup() {
    rootdir = d.getVar('CARGO_VENDORING_DIRECTORY')
    for item in os.listdir(rootdir):
        if item in ['.', '..']:
            continue
        target_path = f'{rootdir}/{item}/.cargo-checksum.json'
        if not os.path.exists(target_path):
            with open(target_path, 'w') as o:
                o.write('{"files":{}}')
}

addtask do_cargo_fixup after do_patch before do_compile
do_cargo_fixup[doc] = "Creates .cargo-checksum.json files where missing"
