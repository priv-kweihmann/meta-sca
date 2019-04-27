SUMMARY = "Native variant of htmlhint"
DESCRIPTION = "Native build of htmlhint."

SRC_URI = "file://htmlhint.sca.description"

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
        "htmlhint@{}".format(d.getVar("PV")),
        "async@2.6.1",
        "colors@1.3.2",
        "commander@2.17.1",
        "csslint@^1.0.5",
        "glob@7.1.3",
        "jshint@^2.9.6",
        "parse-glob@3.0.4",
        "path-parse@1.0.6",
        "request@2.88.0",
        "strip-json-comments@2.0.1",
        "xml@1.0.1"
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
                    content = f.read().replace(d.getVar("B"), "%SYSROOT%/htmlhint")
                with open(fullpath, "w") as f:
                    f.write(content)
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/htmlhint
    cp -Ra ${B}/* ${D}${datadir}/htmlhint
    install ${WORKDIR}/htmlhint.sca.description ${D}${datadir}
}

