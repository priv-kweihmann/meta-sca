SUMMARY = "Lightweight static analysis for many languages (core)"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

COMPATIBLE_HOST = "^x86_64-linux"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=2a4f4fd2128ea2f65047ee63fbca9f68"

SRC_URI:append = " https://github.com/returntocorp/semgrep/releases/download/v${PV}/semgrep-v${PV}-ubuntu-16.04.tgz;name=app"

UPSTREAM_CHECK_URI = "https://github.com/returntocorp/semgrep/tags"
UPSTREAM_CHECK_REGEX = "releases/tag/v(?P<pver>\d+\.\d+\.\d+)"

SRC_URI[app.sha256sum] = "a2b1f806d76da691a6cb9c9eb083eef6e9e8bf6306f86868dcb92eeaa6034787"
SRC_URI[license.sha256sum] = "7c34d28e784b202aa4998f477fd0aa9773146952d7f6fa5971369fcdda59cf48"

inherit native
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"
INHIBIT_PACKAGE_STRIP = "1"
INHIBIT_SYSROOT_STRIP = "1"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/semgrep-files/semgrep-core ${D}${bindir}/semgrep-core
}

FILES:${PN} += "${bindir}"
