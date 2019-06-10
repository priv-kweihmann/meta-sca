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
        "htmlhint": "0.11.0"
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

