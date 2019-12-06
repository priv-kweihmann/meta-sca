SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "e33f25f7556f5f5264a92cb9870d0eac"
SRC_URI[sha256sum] = "a82c334c02ce4b0f9ea77c67bf77738f76a9b8aa4bae5c7209d1c76453d3c48d"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=055ae94478347f74166b045c383827fc"

inherit native
inherit cpan
