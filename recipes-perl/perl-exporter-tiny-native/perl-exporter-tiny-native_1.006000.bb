SUMMARY = "an exporter with the features of Sub::Exporter but only core dependencies"
HOMEPAGE = "https://metacpan.org/pod/Exporter::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=622025314d222840baccc6f37e119800"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Exporter-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "2d555e289eac6450052e8683c292cbf7"
SRC_URI[sha256sum] = "d95479ff085699d6422f7fc8306db085e34b626438deb82ec82d41df2295f400"

S = "${WORKDIR}/Exporter-Tiny-${PV}"

inherit cpan
inherit native
