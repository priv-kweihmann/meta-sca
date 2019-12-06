SUMMARY = "Convert singular to plural"
HOMEPAGE = "https://metacpan.org/pod/Lingua::EN::Inflect"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DC/DCONWAY/Lingua-EN-Inflect-${PV}.tar.gz"

SRC_URI[md5sum] = "c9f01421faf53eef2a6c72cee01c2280"
SRC_URI[sha256sum] = "54d344884ba9b585680975bbd4049ddbf27bf654446fb00c7e1fc538e08c3173"

S = "${WORKDIR}/Lingua-EN-Inflect-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

inherit native
inherit cpan
