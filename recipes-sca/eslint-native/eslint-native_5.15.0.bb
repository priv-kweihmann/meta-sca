SUMMARY = "Native variant of eslint"
DESCRIPTION = "Native build of eslint."

SRC_URI = "file://configs/*"

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
        "eslint@{}".format(d.getVar("PV")),
        "eslint-config-airbnb-base@latest",
        "eslint-config-google@latest",
        "eslint-config-standard@latest",  
        "eslint-plugin-html@5.0.3", 
        "eslint-plugin-import@>=2.13.0", 
        "eslint-plugin-node@>=7.0.0", 
        "eslint-plugin-promise@>=4.0.0", 
        "eslint-plugin-react@latest", 
        "eslint-plugin-standard@>=4.0.0",
        "eslint-plugin-vue@latest",
        "@satazor/eslint-config@latest",
        "@ljharb/eslint-config@latest"
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
                    content = f.read().replace(d.getVar("B"), "%SYSROOT%/eslint")
                with open(fullpath, "w") as f:
                    f.write(content)
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/eslint/configs
    cp -Ra ${B}/* ${D}${datadir}/eslint
    cp -a ${WORKDIR}/configs/* ${D}${datadir}/eslint/configs
}

