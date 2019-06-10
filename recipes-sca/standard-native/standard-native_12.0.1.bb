SUMMARY = "Native variant of standard"
DESCRIPTION = "Native build of standard."

SRC_URI = "file://standard.sca.description \
           file://standard.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

do_configure[noexec] = "1"

FILES_${PN} = "${datadir}/"

inherit native
inherit npm-helper

python do_compile() {
    # npm --prefix . install standard@12.0.1

    ## Install needed pkgs
    pkgs = {
        "standard": "12.0.1"
    }

    for name, version in pkgs.items():
        npm_install_package(d, d.getVar("B"), name, version)

    ## Strip of hardcoded paths in packages
    npm_postinst_fix_paths(d, d.getVar("B"), "standard")
}

INSANE_SKIP_${PN} += "host-user-contaminated"

do_install() {
    mkdir -p ${D}${datadir}/standard
    cp -Ra ${B}/* ${D}${datadir}/standard
    install ${WORKDIR}/standard.sca.description ${D}${datadir}
    install ${WORKDIR}/standard.sca.score ${D}${datadir}
}

