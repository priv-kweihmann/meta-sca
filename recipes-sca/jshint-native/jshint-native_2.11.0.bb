SUMMARY = "Helps to detect errors and potential problems in your JavaScript code"
HOMEPAGE = "https://github.com/jshint/jshint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19041df56fbb7a49fb87c4322d5849"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/jshint/jshint.git;protocol=https \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://jshint.sca.description"
SRCREV = "b7dd7d8f93244abb874fdb616c7a5725209e36b0"
S = "${WORKDIR}/git"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

inherit native
inherit sca-sanity
inherit npm-helper

do_compile() {
    :
}

do_install() {
    export HOME=${S}
    cd ${S}
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${BPN}@${PV}
    if [ -d ${D}${prefix}/etc ] ; then
        # This will be empty
        rmdir ${D}${prefix}/etc
    fi

    install -d ${D}${datadir}

    install ${WORKDIR}/jshint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
