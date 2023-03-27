SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fdfd46d565cb2f0ca782c057d0150dbf"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "9d9e72d3e5ac59167f50bc8a6092d96a"
SRC_URI[sha256sum] = "8df2a7ee5a11bacb8166edd9ee8fc93172278a74d5abe2021a5f4a7d57915c50"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
