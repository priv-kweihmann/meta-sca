SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=622025314d222840baccc6f37e119800"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "0c2002399089ba3748523b25456e5c9e"
SRC_URI[sha256sum] = "0d53898ad60e1b7dc28aeee198c4b6f454f71adefff120f016037e4974395574"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
