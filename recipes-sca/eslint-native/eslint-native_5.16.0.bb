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
    ## Install needed pkgs
    pkgs = {
        "eslint" : "5.16.0",
        "eslint-config-airbnb-base" : "13.1.0",
        "eslint-config-google" : "0.13.0",
        "eslint-config-standard" : "12.0.0",
        "eslint-plugin-html" : "5.0.3",
        "eslint-plugin-import" : "2.17.3",
        "eslint-plugin-node" : "9.1.0",
        "eslint-plugin-promise" : "4.1.1",
        "eslint-plugin-react" : "7.13.0",
        "eslint-plugin-standard" : "4.0.0",
        "eslint-plugin-vue" : "5.2.2",
        "@satazor/eslint-config" : "3.2.0",
        "@ljharb/eslint-config" : "13.1.1"
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

