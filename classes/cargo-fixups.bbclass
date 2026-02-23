# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2024, Konrad Weihmann

CARGO_FIXUP_IGNORE = "/tests/ /examples/"

python do_cargo_fixup() {
    import subprocess

    rootdir = d.getVar('CARGO_VENDORING_DIRECTORY')
    for item in os.listdir(rootdir):
        if item in ['.', '..']:
            continue
        target_path = f'{rootdir}/{item}/.cargo-checksum.json'
        if not os.path.exists(target_path):
            with open(target_path, 'w') as o:
                o.write('{"files":{}}')

    ignores = (d.getVar("CARGO_FIXUP_IGNORE") or "").split(" ")
    for root, dirs, files in os.walk(d.getVar('S')):
        for f in files:
            fullpath = os.path.join(root, f)
            if any(x in fullpath for x in ignores):
                continue
            lockfile = os.path.join(root, f.replace('.toml', '.lock'))
            if f in ['Cargo.toml'] and not os.path.exists(lockfile):
                try:
                    subprocess.check_output(f'cargo generate-lockfile --manifest-path={fullpath}', shell=True)
                except subprocess.CalledProcessError as e:
                    bb.warn(str(e))
}

DEPENDS += "cargo-native"

addtask do_cargo_fixup after do_patch before do_compile
# nooelint: oelint.task.network
do_cargo_fixup[network] = "1"
do_cargo_fixup[doc] = "Creates .cargo-checksum.json files where missing"
