SUMMARY = "Native variant of cspell"
DESCRIPTION = "Native build of cspell."
HOMEPAGE = "https://github.com/Jason3S/cspell"

SRC_URI = "file://cspell.sca.description"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

DEPENDS += "nodejs-native"

FILES_${PN} = "${datadir}/"

inherit native

python do_compile() {
    import json
    import os
    import subprocess

    ## Create fake package-config
    pkg = {
        "name": "Foo",
        "version": "1.0.0",
        "description": "Bar",
        "main": "index.js",
        "dependencies": {},
        "devDependencies": {},
        "scripts": {
            "test": "echo \"Error: no test specified\" && exit 1"
        },
        "author": "",
        "license": "MIT"
    }

    with open("package.json", "w") as i:
        json.dump(pkg, i)

    ## Install needed pkgs
    pkgs = [
        "cspell@{}".format(d.getVar("PV")),
        "chalk@^2.4.2",
        "commander@^2.19.0",
        "comment-json@^1.1.3",
        "configstore@^4.0.0",
        "cspell-dict-companies@^1.0.4",
        "cspell-dict-cpp@^1.1.11",
        "cspell-dict-django@^1.0.7",
        "cspell-dict-elixir@^1.0.4",
        "cspell-dict-en_us@^1.2.10",
        "cspell-dict-en-gb@^1.1.7",
        "cspell-dict-fullstack@^1.0.6",
        "cspell-dict-golang@^1.1.8",
        "cspell-dict-java@^1.0.5",
        "cspell-dict-latex@^1.0.7",
        "cspell-dict-lorem-ipsum@^1.0.4",
        "cspell-dict-php@^1.0.7",
        "cspell-dict-python@^1.0.8",
        "cspell-dict-rust@^1.0.6",
        "cspell-dict-scala@^1.0.5",
        "cspell-lib@^3.0.5",
        "cspell-trie@^3.0.7",
        "fs-extra@^7.0.1",
        "gensequence@^2.1.2",
        "glob@^7.1.3",
        "minimatch@^3.0.4",
        "rxjs@6.3.3",
        "vscode-uri@^1.0.6",
        "xregexp@^4.2.4"
    ]

    for pkg in pkgs:
        try:
            subprocess.check_call(["npm", "install", pkg, "--save-dev"], universal_newlines=True)
        except subprocess.CalledProcessError as e:
            bb.error("Install of NPM package {} failed".format(pkg))

    ## Strip of hardcoded paths in packages
    import os
    for folder, dirs, files in os.walk(d.getVar("B")):
        for _file in files:
            if _file.endswith('.json'):
                fullpath = os.path.join(folder, _file)
                content = ""
                with open(fullpath, 'r') as f:
                    content = f.read().replace(d.getVar("B"), "%SYSROOT%/cspell")
                with open(fullpath, "w") as f:
                    f.write(content)
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/cspell/
    cp -Ra ${B}/* ${D}${datadir}/cspell
    install ${WORKDIR}/cspell.sca.description ${D}${datadir}
}

