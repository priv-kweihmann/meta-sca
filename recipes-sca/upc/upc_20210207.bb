SUMMARY = "Shell script to check for simple privilege escalation vectors on Unix systems"
HOMEPAGE = "https://github.com/pentestmonkey/unix-privesc-check"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://doc/COPYING.GPL;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/pentestmonkey/unix-privesc-check.git;branch=master;protocol=https \
           file://upc.sca.description"

SRCREV = "c7d27e8a2d2d54540778c6d7c1c5bcc290dbba1a"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit sca-description

do_compile[noexec] = "1"
do_configure[noexec] = "1"

do_install() {
    install -d ${D}${bindir}/upc
    install -d ${D}${bindir}/upc/tools
    install -d ${D}${bindir}/upc/lib
    for _d in "tools" "lib"; do
        cd ${S}/${_d}
        for f in $(find . -type f); do
            _f=$(echo "$f" | sed "s#^./##g")
            [ ! -z $(dirname $_f ) ] && install -d ${D}${bindir}/upc/${_d}/$(dirname $_f)
            install $_f ${D}${bindir}/upc/${_d}/$_f
        done
        cd -
    done
    install ${S}/lib/checks/ssh_key ${D}${bindir}/upc/lib/misc/ssh_key
    install -m 0755 ${S}/upc.sh ${D}${bindir}/upc/
}

do_install:append:class-native () {
    install -d ${D}/${datadir}
    install ${WORKDIR}/upc.sca.description ${D}${datadir}
}

FILES:${PN} = "${bindir}"
FILES:${PN}:class-native += "${datadir}"

INSANE_SKIP:${PN} += "file-rdeps"

BBCLASSEXTEND = "native"
