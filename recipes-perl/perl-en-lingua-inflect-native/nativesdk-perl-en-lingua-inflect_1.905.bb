SUMMARY = "Convert singular to plural"
HOMEPAGE = "https://metacpan.org/pod/Lingua::EN::Inflect"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-or-later;md5=fed54355545ffd980b814dab4a3b312c"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCONWAY/Lingua-EN-Inflect-${PV}.tar.gz"

SRC_URI[md5sum] = "6c2665abc4c1d62103324c30984a20e7"
SRC_URI[sha256sum] = "05c29ec3482e572313a60da2181b0b30c5db7cf01f8ae7616ad67e1b66263296"

S = "${WORKDIR}/Lingua-EN-Inflect-${PV}"

inherit cpan
inherit nativesdk
