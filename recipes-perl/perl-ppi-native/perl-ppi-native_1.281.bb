SUMMARY = "Parse, Analyze and Manipulate Perl (without perl)"
HOMEPAGE = "https://metacpan.org/pod/PPI"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=d41d8cd98f00b204e9800998ecf8427e"

DEPENDS += "\
            perl-clone-native \
            perl-io-string-native \
            perl-params-util-native \
            perl-task-weaken-native \
           "

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MITHALDU/PPI-${PV}.tar.gz"

SRC_URI[md5sum] = "67082904459168f33edce6c0d882dca3"
SRC_URI[sha256sum] = "1141bc4fa472ae633e222ac0d13b3394db8a4c35f6fb3852ac6ebc97d01275d2"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPI-${PV}"

inherit cpan
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-perl-clone \
    nativesdk-perl-io-string \
    nativesdk-perl-params-util \
    nativesdk-perl-task-weaken \
"
