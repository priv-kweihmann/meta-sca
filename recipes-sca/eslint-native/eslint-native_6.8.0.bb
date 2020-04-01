SUMMARY = "A fully pluggable tool for identifying and reporting on patterns in JavaScript"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04d32f89e7aa1677f8a860eb0b6adb83"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/eslint/eslint.git;protocol=https;tag=v${PV} \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://configs/eslint-airbnb.json \
           file://configs/eslint-google.json \
           file://configs/eslint-plain.json \
           file://configs/eslint-standard.json \
           file://eslint.sca.description"

S = "${WORKDIR}/git"

inherit native
inherit npm-helper
inherit sca-sanity

do_compile() {
    :
}

do_install() {
    export HOME=${S}
    cd ${S}
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-config-airbnb-base@14.0.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-config-google@0.14.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-config-standard@14.1.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev @getify/eslint-plugin-proper-arrows@8.0.1
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-array-func@3.1.4
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-deprecate@0.7.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-filenames@1.3.2
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-fp@2.3.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-html@6.0.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-immutable@1.0.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-import@2.18.2
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-jsx-a11y@6.2.3
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-no-loops@0.3.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-no-secrets@0.3.4
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-no-use-extend-native@0.4.1
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-node@11.0.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-promise@4.2.1
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-react@7.17.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-security@1.4.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-sql@1.1.1
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-standard@4.0.1
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-this@0.2.3
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-unicorn@17.2.0
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-vue@6.2.2
    npm install --prefix ${D}${prefix} ${NPM_EXTRA_ARGS} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --save-dev eslint-plugin-xss@0.1.9

    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    install -d ${D}/${datadir}/eslint/configs
    for _f in ${WORKDIR}/configs/*; do
        install ${_f} ${D}/${datadir}/eslint/configs/
    done

    install -d ${D}${datadir}

    install ${WORKDIR}/eslint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
