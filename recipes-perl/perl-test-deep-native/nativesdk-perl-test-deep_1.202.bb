SUMMARY = "Extremely flexible deep comparison"
HOMEPAGE = "https://metacpan.org/pod/Test::Deep"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-${PV}.tar.gz"

SRC_URI[md5sum] = "1483ed950669cbba27ff4a7ca865ed2a"
SRC_URI[sha256sum] = "2aa985eede185d594d7227b2fb7399cf70bda317aa7781234c40edf01b8a32b1"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan
inherit nativesdk
