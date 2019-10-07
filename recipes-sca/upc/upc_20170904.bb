SUMMARY = "Shell script to check for simple privilege escalation vectors on Unix systems"
HOMEPAGE = "https://github.com/pentestmonkey/unix-privesc-check"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://doc/COPYING.GPL;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://github.com/pentestmonkey/unix-privesc-check.git;protocol=https \
           file://upc.sca.description \
           file://upc.sca.score"
SRCREV = "de8223a7b2ff3ed8fa6344cf4a358ec624e42270"

S = "${WORKDIR}/git"

do_compile() {
	:
}

do_configure() {
	:
}

do_install() {
	mkdir -p ${D}${bindir}/upc
	mkdir -p ${D}${bindir}/upc/tools
	mkdir -p ${D}${bindir}/upc/lib
	cp -Ra ${S}/tools/* ${D}${bindir}/upc/tools/
	cp -Ra ${S}/lib/* ${D}${bindir}/upc/lib/
	cp -a ${S}/lib/checks/ssh_key ${D}${bindir}/upc/lib/misc/ssh_key
	install -m 0755 ${S}/upc.sh ${D}${bindir}/upc/
}

do_install_append_class-native () {
	install -d ${D}/${datadir}

    install ${WORKDIR}/upc.sca.description ${D}${datadir}
    install ${WORKDIR}/upc.sca.score ${D}${datadir}
}

INSANE_SKIP_${PN} += "host-user-contaminated file-rdeps"

FILES_${PN} = "${bindir}"
FILES_${PN}_class-native += "${datadir}"

BBCLASSEXTEND = "native"