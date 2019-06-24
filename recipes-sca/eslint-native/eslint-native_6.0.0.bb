SUMMARY = "A fully pluggable tool for identifying and reporting on patterns in JavaScript"
DESCRIPTION = "A fully pluggable tool for identifying and reporting on patterns in JavaScript"

SRC_URI = "git://github.com/eslint/eslint.git;protocol=https;tag=v${PV} \
           file://configs/* \
           file://eslint.sca.description \
           file://eslint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://git/LICENSE;md5=04d32f89e7aa1677f8a860eb0b6adb83"

DEPENDS += "nodejs-native"

inherit native

S = "${WORKDIR}"

do_compile() {
    :
}

do_install() {
    export HOME=${WORKDIR}
    cd ${WORKDIR}
	mkdir -p ${D}${libdir}/node_modules
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-config-airbnb-base@13.1.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-config-google@0.13.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-config-standard@12.0.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-html@5.0.3
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-import@2.17.3
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-node@9.1.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-promise@4.1.1
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-react@7.13.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-standard@4.0.0
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production eslint-plugin-vue@5.2.2
	if [ -d ${D}${prefix}/etc ] ; then
		# This will be empty
		rmdir ${D}${prefix}/etc
	fi

    install ${WORKDIR}/eslint.sca.description ${D}${datadir}
    install ${WORKDIR}/eslint.sca.score ${D}${datadir}
}

FILES_${PN} = "*"
