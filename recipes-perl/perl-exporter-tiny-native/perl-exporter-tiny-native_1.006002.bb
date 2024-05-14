SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdfd46d565cb2f0ca782c057d0150dbf"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "0545ee8f4edcb9dc5a87b21ed25edd74"
SRC_URI[sha256sum] = "6f295e2cbffb1dbc15bdb9dadc341671c1e0cd2bdf2d312b17526273c322638d"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit_defer native
