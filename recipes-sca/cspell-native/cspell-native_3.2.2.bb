SUMMARY = "Native variant of cspell"
DESCRIPTION = "Native build of cspell."
HOMEPAGE = "https://github.com/Jason3S/cspell"

SRC_URI = "file://cspell.sca.description \
           file://cspell.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    # npm --prefix . install cspell@3.2.2
    # npm --prefix . install cspell-dict-companies@1.0.4
    # npm --prefix . install cspell-dict-cpp@1.1.11
    # npm --prefix . install cspell-dict-django@1.0.7
    # npm --prefix . install cspell-dict-elixir@1.0.4
    # npm --prefix . install cspell-dict-en_us@1.2.10
    # npm --prefix . install cspell-dict-en-gb@1.1.7
    # npm --prefix . install cspell-dict-fullstack@1.0.6
    # npm --prefix . install cspell-dict-golang@1.1.8
    # npm --prefix . install cspell-dict-java@1.0.5
    # npm --prefix . install cspell-dict-latex@1.0.7
    # npm --prefix . install cspell-dict-lorem-ipsum@1.0.4
    # npm --prefix . install cspell-dict-php@1.0.7
    # npm --prefix . install cspell-dict-python@1.0.8
    # npm --prefix . install cspell-dict-rust@1.0.6
    # npm --prefix . install cspell-dict-scala@1.0.5
    # npm --prefix . install cspell-lib@3.0.5
    # npm --prefix . install cspell-trie@3.0.7

    ## Install needed pkgs
    pkgs = {
        "cspell" : "3.2.2",
        "cspell-dict-companies" : "1.0.4",
        "cspell-dict-cpp" : "1.1.11",
        "cspell-dict-django" : "1.0.7",
        "cspell-dict-elixir" : "1.0.4",
        "cspell-dict-en_us" : "1.2.10",
        "cspell-dict-en-gb" : "1.1.7",
        "cspell-dict-fullstack" : "1.0.6",
        "cspell-dict-golang" : "1.1.8",
        "cspell-dict-java" : "1.0.5",
        "cspell-dict-latex" : "1.0.7",
        "cspell-dict-lorem-ipsum" : "1.0.4",
        "cspell-dict-php" : "1.0.7",
        "cspell-dict-python" : "1.0.8",
        "cspell-dict-rust" : "1.0.6",
        "cspell-dict-scala" : "1.0.5",
        "cspell-lib" : "3.0.5",
        "cspell-trie" : "3.0.7"
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
    install ${WORKDIR}/cspell.sca.score ${D}${datadir}
}

