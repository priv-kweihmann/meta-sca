SUMMARY = "Native variant of stylelint"
DESCRIPTION = "Native build of stylelint."

SRC_URI = "file://stylelint.sca.description \
           file://stylelint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    # npm --prefix . install stylelint@10.1.0

    ## Install needed pkgs
    pkgs = {
        "stylelint": "10.1.0"
    }


    for name, version in pkgs.items():
        npm_install_package(d, d.getVar("B"), name, version)

    ## Strip of hardcoded paths in packages
    npm_postinst_fix_paths(d, d.getVar("B"), "stylelint")
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/stylelint
    cp -Ra ${B}/* ${D}${datadir}/stylelint
    install ${WORKDIR}/stylelint.sca.description ${D}${datadir}
    install ${WORKDIR}/stylelint.sca.score ${D}${datadir}
}

