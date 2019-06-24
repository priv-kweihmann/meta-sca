SUMMARY = "A mighty, modern style linter"
DESCRIPTION = "A mighty, modern style linter"
HOMEPAGE = "https://github.com/stylelint/stylelint"

SRC_URI = "git://github.com/stylelint/stylelint.git;protocol=https;tag=${PV} \
           file://stylelint.sca.description \
           file://stylelint.sca.score"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://git/LICENSE;md5=0e0ecf49fffcf64b1f3fa0a956ea44a0"

DEPENDS += "nodejs-native"

inherit native

S = "${WORKDIR}"

do_compile() {
    :
}

do_install() {
    export HOME=${WORKDIR}
	mkdir -p ${D}${libdir}/node_modules
    npm install --prefix ${D}${prefix} -g --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
	if [ -d ${D}${prefix}/etc ] ; then
		# This will be empty
		rmdir ${D}${prefix}/etc
	fi

    install ${WORKDIR}/stylelint.sca.description ${D}${datadir}
    install ${WORKDIR}/stylelint.sca.score ${D}${datadir}
}

FILES_${PN} = "*"
