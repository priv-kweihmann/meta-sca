SUMMARY = "Build.PL install path logic made easy"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::InstallPaths"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6fa54d873ce6bcf4809ea88bdf97769"

DEPENDS += "perl-extutils-config-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-InstallPaths-${PV}.tar.gz"

SRC_URI[md5sum] = "9a8d66aab1ffec98ea260faf03ac612b"
SRC_URI[sha256sum] = "84735e3037bab1fdffa3c2508567ad412a785c91599db3c12593a50a1dd434ed"

S = "${WORKDIR}/ExtUtils-InstallPaths-${PV}"

inherit cpan
inherit native
