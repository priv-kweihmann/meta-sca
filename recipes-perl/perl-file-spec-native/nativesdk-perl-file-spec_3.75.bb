SUMMARY = "portably perform operations on file names"
HOMEPAGE = "https://metacpan.org/pod/File::Spec"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/PathTools-${PV}.tar.gz"

SRC_URI[md5sum] = "8f329058f74468a576442d841c62aa62"
SRC_URI[sha256sum] = "a558503aa6b1f8c727c0073339081a77888606aa701ada1ad62dd9d8c3f945a2"

S = "${WORKDIR}/PathTools-${PV}"

inherit cpan
inherit nativesdk
