SUMMARY = "Native variant of eslint"
DESCRIPTION = "Native build of eslint."

SRC_URI = "file://configs/* \
           file://eslint.sca.description \
           file://eslint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    # npm --prefix . install eslint@5.16.0
    # npm --prefix . install eslint-config-airbnb-base@latest
    # npm --prefix . install eslint-config-google@latest
    # npm --prefix . install eslint-config-standard@latest 
    # npm --prefix . install eslint-plugin-html@5.0.3
    # npm --prefix . install eslint-plugin-import@>=2.13.0
    # npm --prefix . install eslint-plugin-node@>=7.0.0
    # npm --prefix . install eslint-plugin-promise@>=4.0.0
    # npm --prefix . install eslint-plugin-react@latest
    # npm --prefix . install eslint-plugin-standard@>=4.0.0
    # npm --prefix . install eslint-plugin-vue@latest
    # npm --prefix . install @satazor/eslint-config@latest
    # npm --prefix . install @ljharb/eslint-config@latest

    ## Install needed pkgs
    pkgs = {
        "load-json-file": "2.0.0",
        "has-symbols": "1.0.0",
        "path-parse": "1.0.6",
        "array-includes": "3.0.3",
        "doctrine": "2.1.0",
        "inherits": "2.0.3",
        "is-promise": "2.1.0",
        "inquirer": "6.3.1",
        "eslint-restricted-globals": "0.1.1",
        "path-key": "2.0.1",
        "eslint-utils": "1.3.1",
        "js-tokens": "4.0.0",
        "p-try": "1.0.0",
        "debug": "2.6.9",
        "readable-stream": "3.3.0",
        "eslint-scope": "4.0.3",
        "os-tmpdir": "1.0.2",
        "write": "1.0.3",
        "domhandler": "2.4.2",
        "natural-compare": "1.4.0",
        "rimraf": "2.6.3",
        "util-deprecate": "1.0.2",
        "mkdirp": "0.5.1",
        "acorn": "6.1.1",
        "eslint-plugin-html": "5.0.3",
        "cross-spawn": "6.0.5",
        "eslint-plugin-es": "1.4.0",
        "run-async": "2.3.0",
        "parent-module": "1.0.1",
        "object-keys": "1.1.1",
        "eslint-visitor-keys": "1.0.0",
        "json-schema-traverse": "0.4.1",
        "ansi-styles": "3.2.1",
        "cli-cursor": "2.1.0",
        "wrappy": "1.0.2",
        "ansi-escapes": "3.2.0",
        "astral-regex": "1.0.0",
        "is-symbol": "1.0.2",
        "tslib": "1.9.3",
        "signal-exit": "3.0.2",
        "eslint-plugin-promise": "4.1.1",
        "json-stable-stringify-without-jsonify": "1.0.1",
        "@ljharb/eslint-config": "13.1.1",
        "eslint-plugin-vue": "5.2.2",
        "parse-json": "2.2.0",
        "regexpp": "2.0.1",
        "eslint": "5.16.0",
        "safer-buffer": "2.1.2",
        "wordwrap": "1.0.0",
        "vue-eslint-parser": "5.0.0",
        "minimatch": "3.0.4",
        "eslint-config-google": "0.12.0",
        "react-is": "16.8.6",
        "file-entry-cache": "5.0.1",
        "strip-ansi": "5.2.0",
        "balanced-match": "1.0.0",
        "ansi-regex": "4.1.0",
        "fast-deep-equal": "2.0.1",
        "string-width": "3.1.0",
        "inflight": "1.0.6",
        "fast-levenshtein": "2.0.6",
        "is-fullwidth-code-point": "2.0.0",
        "resolve": "1.10.1",
        "function-bind": "1.1.1",
        "minimist": "0.0.8",
        "espree": "4.1.0",
        "eslint-import-resolver-node": "0.3.2",
        "sprintf-js": "1.0.3",
        "loose-envify": "1.4.0",
        "onetime": "2.0.1",
        "glob": "7.1.3",
        "prop-types": "15.7.2",
        "path-is-absolute": "1.0.1",
        "restore-cursor": "2.0.0",
        "acorn-jsx": "5.0.1",
        "dom-serializer": "0.1.1",
        "path-is-inside": "1.0.2",
        "eslint-plugin-node": "8.0.1",
        "normalize-package-data": "2.5.0",
        "brace-expansion": "1.1.11",
        "which": "1.3.1",
        "eslint-config-airbnb-base": "13.1.0",
        "isarray": "1.0.0",
        "cli-width": "2.2.0",
        "read-pkg-up": "2.0.0",
        "define-properties": "1.1.3",
        "once": "1.4.0",
        "eslint-plugin-standard": "4.0.0",
        "mute-stream": "0.0.7",
        "pify": "2.3.0",
        "pkg-dir": "2.0.0",
        "is-arrayish": "0.2.1",
        "hosted-git-info": "2.7.1",
        "object.fromentries": "2.0.0",
        "rxjs": "6.5.1",
        "spdx-correct": "3.1.0",
        "callsites": "3.1.0",
        "p-locate": "2.0.0",
        "strip-json-comments": "2.0.1",
        "is-regex": "1.0.4",
        "slice-ansi": "2.1.0",
        "entities": "1.1.2",
        "semver": "5.7.0",
        "emoji-regex": "7.0.3",
        "has-flag": "3.0.0",
        "estraverse": "4.2.0",
        "eslint-module-utils": "2.4.0",
        "js-yaml": "3.13.1",
        "flat-cache": "2.0.1",
        "object.entries": "1.1.0",
        "path-type": "2.0.0",
        "spdx-exceptions": "2.2.0",
        "levn": "0.3.0",
        "iconv-lite": "0.4.24",
        "fast-json-stable-stringify": "2.0.0",
        "safe-buffer": "5.1.2",
        "validate-npm-package-license": "3.0.4",
        "chalk": "2.4.2",
        "string_decoder": "1.2.0",
        "@babel/code-frame": "7.0.0",
        "concat-map": "0.0.1",
        "ms": "2.0.0",
        "progress": "2.0.3",
        "object-assign": "4.1.1",
        "locate-path": "2.0.0",
        "eslint-config-standard": "12.0.0",
        "flatted": "2.0.0",
        "spdx-expression-parse": "3.0.0",
        "color-convert": "1.9.3",
        "eslint-plugin-import": "2.17.2",
        "supports-color": "5.5.0",
        "path-exists": "3.0.0",
        "esprima": "4.0.1",
        "chardet": "0.7.0",
        "prelude-ls": "1.1.2",
        "tmp": "0.0.33",
        "type-check": "0.3.2",
        "deep-is": "0.1.3",
        "mimic-fn": "1.2.0",
        "isexe": "2.0.0",
        "es-abstract": "1.13.0",
        "globals": "11.11.0",
        "@satazor/eslint-config": "3.2.0",
        "uri-js": "4.2.2",
        "graceful-fs": "4.1.15",
        "jsx-ast-utils": "2.1.0",
        "external-editor": "3.0.3",
        "table": "5.2.3",
        "argparse": "1.0.10",
        "eslint-plugin-react": "7.12.4",
        "@babel/highlight": "7.0.0",
        "esutils": "2.0.2",
        "error-ex": "1.3.2",
        "imurmurhash": "0.1.4",
        "spdx-license-ids": "3.0.4",
        "functional-red-black-tree": "1.0.1",
        "find-up": "2.1.0",
        "color-name": "1.1.3",
        "optionator": "0.8.2",
        "htmlparser2": "3.10.1",
        "esrecurse": "4.2.1",
        "shebang-command": "1.2.0",
        "fs.realpath": "1.0.0",
        "read-pkg": "2.0.0",
        "es-to-primitive": "1.2.0",
        "domutils": "1.7.0",
        "punycode": "2.1.1",
        "domelementtype": "1.3.1",
        "shebang-regex": "1.0.0",
        "esquery": "1.0.1",
        "has": "1.0.3",
        "contains-path": "0.1.0",
        "escape-string-regexp": "1.0.5",
        "object.assign": "4.1.0",
        "ignore": "5.1.1",
        "import-fresh": "3.0.0",
        "strip-bom": "3.0.0",
        "is-date-object": "1.0.1",
        "through": "2.3.8",
        "is-callable": "1.1.4",
        "lodash": "4.17.11",
        "resolve-from": "4.0.0",
        "p-limit": "1.3.0",
        "nice-try": "1.0.5",
        "ajv": "6.10.0",
        "figures": "2.0.0",
        "text-table": "0.2.0"
    }


    for name, version in pkgs.items():
        npm_install_package(d, d.getVar("B"), name, version)

    ## Strip of hardcoded paths in packages
    npm_postinst_fix_paths(d, d.getVar("B"), "eslint")
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/eslint/configs
    cp -Ra ${B}/* ${D}${datadir}/eslint
    cp -a ${WORKDIR}/configs/* ${D}${datadir}/eslint/configs
    install ${WORKDIR}/eslint.sca.description ${D}${datadir}
    install ${WORKDIR}/eslint.sca.score ${D}${datadir}
}

