SUMMARY = "The static code analysis tool you need for your HTML"
HOMEPAGE = "https://github.com/htmlhint/HTMLHint"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS += "nodejs-native"

SRC_URI = "git://github.com/htmlhint/HTMLHint.git;protocol=https \
           file://modules_${BPN}-${PV}.tar.gz;subdir=git \
           file://htmlhint.sca.description"
SRCREV = "260de62f2f400c8d570cf021add18dd840c1bc03"

S = "${WORKDIR}/git"

inherit native
inherit npm-helper
inherit sca-sanity
inherit sca-description

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

    install ${WORKDIR}/htmlhint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
