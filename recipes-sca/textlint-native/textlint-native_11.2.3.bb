SUMMARY = "The pluggable natural language linter for text and markdown."
DESCRIPTION = "The pluggable natural language linter for text and markdown."
HOMEPAGE = "https://github.com/textlint/textlint"

SRC_URI = "file://textlint.sca.description"

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

    online_pkgs = ["textlint-rule-no-dead-link"]
    plugins = ["textlint-plugin-html", "textlint-plugin-rst"]
    filters = ["textlint-filter-rule-comments"]

    with open(os.path.join(d.getVar("B"), "online-rules.json"), "w") as o:
        json.dump(online_pkgs, o)

    ## Install needed pkgs
    pkgs = [
        "textlint@{}".format(d.getVar("PV")),
        "textlint-rule-no-todo@2.0.1",
        "textlint-rule-no-start-duplicated-conjunction@2.0.2",
        "textlint-rule-max-number-of-lines@1.0.3",
        "textlint-rule-max-comma@1.0.4",
        "textlint-rule-no-exclamation-question-mark@1.0.2",
        "textlint-rule-ng-word@1.0.0",
        "textlint-rule-no-dead-link@4.4.1",
        "textlint-rule-no-empty-section@1.1.0",
        "textlint-rule-unexpanded-acronym@1.2.3",
        "textlint-rule-alex@1.3.1",
        "textlint-rule-write-good@latest",
        "textlint-rule-rousseau@1.4.5",
        "textlint-rule-en-max-word-count@1.0.1",
        "textlint-filter-rule-comments@1.2.2",
        "textlint-plugin-html@0.2.0",
        "textlint-plugin-rst@latest",
        "textlint-rule-date-weekday-mismatch@1.0.5",
        "textlint-rule-terminology@1.1.30",
        "textlint-rule-period-in-list-item@0.3.0",
        "textlint-rule-no-nfd@1.0.1",
        "@textlint-rule/textlint-rule-no-invalid-control-character@1.2.0",
        "textlint-rule-no-surrogate-pair@1.0.1",
        "textlint-rule-abbr-within-parentheses@1.0.2",
        "textlint-rule-common-misspellings@latest",
        "textlint-rule-ginger@2.2.1",
        "textlint-rule-apostrophe@1.0.0",
        "textlint-rule-diacritics@0.0.2",
        "textlint-rule-stop-words@1.0.12",
        "textlint-rule-en-capitalization@2.0.1",
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
    mkdir -p ${D}${datadir}/textlint/
    cp -Ra ${B}/* ${D}${datadir}/textlint
    install ${WORKDIR}/textlint.sca.description ${D}${datadir}
}

