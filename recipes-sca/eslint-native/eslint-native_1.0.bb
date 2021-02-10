SUMMARY = "sca definition for eslint"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            npm-eslint-config-airbnb-base-native \
            npm-eslint-config-google-native \
            npm-eslint-config-standard-native \
            npm-eslint-native \
            npm-eslint-plugin-array-func-native \
            npm-eslint-plugin-deprecate-native \
            npm-eslint-plugin-filenames-native \
            npm-eslint-plugin-fp-native \
            npm-eslint-plugin-html-native \
            npm-eslint-plugin-immutable-native \
            npm-eslint-plugin-import-native \
            npm-eslint-plugin-jsx-a11y-native \
            npm-eslint-plugin-no-loops-native \
            npm-eslint-plugin-no-secrets-native \
            npm-eslint-plugin-no-use-extend-native-native \
            npm-eslint-plugin-node-native \
            npm-eslint-plugin-promise-native \
            npm-eslint-plugin-react-native \
            npm-eslint-plugin-security-native \
            npm-eslint-plugin-sql-native \
            npm-eslint-plugin-standard-native \
            npm-eslint-plugin-this-native \
            npm-eslint-plugin-unicorn-native \
            npm-eslint-plugin-vue-native \
            npm-eslint-plugin-xss-native \
            npm-getify-eslint-plugin-proper-arrows-native \
            "

SRC_URI = "file://configs/eslint-plain.json \
           file://eslint.sca.description"

inherit sca-description
inherit native

do_install() {
    install -d ${D}/${datadir}/eslint/configs
    for _f in ${WORKDIR}/configs/*; do
        install ${_f} ${D}/${datadir}/eslint/configs/
    done
    install -d ${D}${datadir}
    install ${WORKDIR}/eslint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
