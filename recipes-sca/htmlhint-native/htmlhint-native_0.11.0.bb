SUMMARY = "Native variant of htmlhint"
DESCRIPTION = "Native build of htmlhint."

SRC_URI = "file://htmlhint.sca.description \
           file://htmlhint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    # npm --prefix . install htmlhint@0.11.0

    ## Install needed pkgs
    pkgs = {
        "isarray": "0.0.1",
        "xml": "1.0.1",
        "glob-parent": "2.0.0",
        "getpass": "0.1.7",
        "uri-js": "4.2.2",
        "fs.realpath": "1.0.0",
        "isstream": "0.1.2",
        "cli": "1.0.1",
        "ajv": "6.10.0",
        "dom-serializer": "0.1.1",
        "json-schema": "0.2.3",
        "asn1": "0.2.4",
        "inflight": "1.0.6",
        "uuid": "3.3.2",
        "tweetnacl": "0.14.5",
        "glob-base": "0.3.0",
        "assert-plus": "1.0.0",
        "minimatch": "3.0.4",
        "readable-stream": "1.1.14",
        "parserlib": "1.1.1",
        "safe-buffer": "5.1.2",
        "bcrypt-pbkdf": "1.0.2",
        "request": "2.88.0",
        "entities": "1.0.0",
        "mime-types": "2.1.24",
        "core-util-is": "1.0.2",
        "wrappy": "1.0.2",
        "parse-glob": "3.0.4",
        "combined-stream": "1.0.7",
        "http-signature": "1.2.0",
        "is-typedarray": "1.0.0",
        "path-parse": "1.0.6",
        "aws4": "1.8.0",
        "json-schema-traverse": "0.4.1",
        "domutils": "1.5.1",
        "lodash": "4.17.11",
        "form-data": "2.3.3",
        "tunnel-agent": "0.6.0",
        "json-stringify-safe": "5.0.1",
        "domhandler": "2.3.0",
        "qs": "6.5.2",
        "har-validator": "5.1.3",
        "async": "2.6.1",
        "commander": "2.17.1",
        "caseless": "0.12.0",
        "aws-sign2": "0.7.0",
        "performance-now": "2.1.0",
        "sshpk": "1.16.1",
        "date-now": "0.1.4",
        "concat-map": "0.0.1",
        "inherits": "2.0.3",
        "htmlparser2": "3.8.3",
        "forever-agent": "0.6.1",
        "exit": "0.1.2",
        "console-browserify": "1.1.0",
        "fast-json-stable-stringify": "2.0.0",
        "glob": "7.1.3",
        "strip-json-comments": "2.0.1",
        "ecc-jsbn": "0.1.2",
        "jsprim": "1.4.1",
        "extend": "3.0.2",
        "shelljs": "0.3.0",
        "verror": "1.10.0",
        "mime-db": "1.40.0",
        "jsbn": "0.1.1",
        "is-extglob": "1.0.0",
        "balanced-match": "1.0.0",
        "is-glob": "2.0.1",
        "brace-expansion": "1.1.11",
        "extsprintf": "1.3.0",
        "dashdash": "1.14.1",
        "psl": "1.1.31",
        "oauth-sign": "0.9.0",
        "csslint": "1.0.5",
        "fast-deep-equal": "2.0.1",
        "tough-cookie": "2.4.3",
        "path-is-absolute": "1.0.1",
        "clone": "2.1.2",
        "colors": "1.3.2",
        "har-schema": "2.0.0",
        "htmlhint": "0.11.0",
        "safer-buffer": "2.1.2",
        "domelementtype": "1.3.1",
        "asynckit": "0.4.0",
        "is-dotfile": "1.0.3",
        "once": "1.4.0",
        "delayed-stream": "1.0.0",
        "punycode": "1.4.1",
        "jshint": "2.10.2",
        "string_decoder": "0.10.31"
    }

    for name, version in pkgs.items():
        npm_install_package(d, d.getVar("B"), name, version)

    ## Strip of hardcoded paths in packages
    npm_postinst_fix_paths(d, d.getVar("B"), "htmlhint")
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/htmlhint
    cp -Ra ${B}/* ${D}${datadir}/htmlhint
    install ${WORKDIR}/htmlhint.sca.description ${D}${datadir}
}

