SUMMARY = "Native variant of cspell"
DESCRIPTION = "Native build of cspell."
HOMEPAGE = "https://github.com/Jason3S/cspell"

SRC_URI = "file://cspell.sca.description"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    # npm --prefix . install cspell@3.2.2
    # npm --prefix . install chalk@^2.4.2
    # npm --prefix . install commander@^2.19.0
    # npm --prefix . install comment-json@^1.1.3
    # npm --prefix . install configstore@^4.0.0
    # npm --prefix . install cspell-dict-companies@^1.0.4
    # npm --prefix . install cspell-dict-cpp@^1.1.11
    # npm --prefix . install cspell-dict-django@^1.0.7
    # npm --prefix . install cspell-dict-elixir@^1.0.4
    # npm --prefix . install cspell-dict-en_us@^1.2.10
    # npm --prefix . install cspell-dict-en-gb@^1.1.7
    # npm --prefix . install cspell-dict-fullstack@^1.0.6
    # npm --prefix . install cspell-dict-golang@^1.1.8
    # npm --prefix . install cspell-dict-java@^1.0.5
    # npm --prefix . install cspell-dict-latex@^1.0.7
    # npm --prefix . install cspell-dict-lorem-ipsum@^1.0.4
    # npm --prefix . install cspell-dict-php@^1.0.7
    # npm --prefix . install cspell-dict-python@^1.0.8
    # npm --prefix . install cspell-dict-rust@^1.0.6
    # npm --prefix . install cspell-dict-scala@^1.0.5
    # npm --prefix . install cspell-lib@^3.0.5
    # npm --prefix . install cspell-trie@^3.0.7
    # npm --prefix . install fs-extra@^7.0.1
    # npm --prefix . install gensequence@^2.1.2
    # npm --prefix . install glob@^7.1.3
    # npm --prefix . install minimatch@^3.0.4
    # npm --prefix . install rxjs@6.3.3
    # npm --prefix . install vscode-uri@^1.0.6
    # npm --prefix . install xregexp@^4.2.4

    ## Install needed pkgs
    pkgs = {
        "concat-map": "0.0.1",
        "cspell-dict-en_us": "1.2.11",
        "minimatch": "3.0.4",
        "signal-exit": "3.0.2",
        "iconv-lite": "0.4.24",
        "comment-json": "1.1.3",
        "esprima": "2.7.3",
        "color-name": "1.1.3",
        "escape-string-regexp": "1.0.5",
        "pify": "3.0.0",
        "once": "1.4.0",
        "regenerator-runtime": "0.13.2",
        "tslib": "1.9.3",
        "jsonfile": "4.0.0",
        "ansi-styles": "3.2.1",
        "brace-expansion": "1.1.11",
        "rxjs-stream": "3.0.1",
        "cspell-dict-fullstack": "1.0.8",
        "cspell-dict-en-gb": "1.1.8",
        "cspell-dict-golang": "1.1.9",
        "color-convert": "1.9.3",
        "commander": "2.20.0",
        "inherits": "2.0.3",
        "hunspell-reader": "2.1.2",
        "vscode-uri": "1.0.6",
        "cspell": "3.2.2",
        "path-is-absolute": "1.0.1",
        "is-obj": "1.0.1",
        "crypto-random-string": "1.0.0",
        "gensequence": "2.1.2",
        "cspell-dict-django": "1.0.8",
        "unique-string": "1.0.0",
        "inflight": "1.0.6",
        "cspell-dict-scala": "1.0.6",
        "glob": "7.1.3",
        "cspell-dict-python": "1.0.9",
        "graceful-fs": "4.1.15",
        "wrappy": "1.0.2",
        "cspell-dict-lorem-ipsum": "1.0.5",
        "cspell-trie": "3.0.7",
        "json-parser": "1.1.5",
        "supports-color": "5.5.0",
        "balanced-match": "1.0.0",
        "configstore": "4.0.0",
        "cspell-dict-cpp": "1.1.13",
        "make-dir": "1.3.0",
        "rxjs": "6.3.3",
        "has-flag": "3.0.0",
        "write-file-atomic": "2.4.2",
        "cspell-lib": "3.0.5",
        "cspell-dict-companies": "1.0.6",
        "imurmurhash": "0.1.4",
        "xdg-basedir": "3.0.0",
        "cspell-dict-latex": "1.0.8",
        "fs.realpath": "1.0.0",
        "core-js": "2.6.5",
        "fs-extra": "7.0.1",
        "safer-buffer": "2.1.2",
        "cspell-dict-elixir": "1.0.5",
        "cspell-dict-php": "1.0.8",
        "chalk": "2.4.2",
        "xregexp": "4.2.4",
        "universalify": "0.1.2",
        "@babel/runtime-corejs2": "7.4.4",
        "cspell-dict-rust": "1.0.6",
        "cspell-dict-java": "1.0.7",
        "dot-prop": "4.2.0"
    }

    for name, version in pkgs.items():
        npm_install_package(d, d.getVar("B"), name, version)

    ## Strip of hardcoded paths in packages
    npm_postinst_fix_paths(d, d.getVar("B"), "cspell")
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/cspell/
    cp -Ra ${B}/* ${D}${datadir}/cspell
    install ${WORKDIR}/cspell.sca.description ${D}${datadir}
}

