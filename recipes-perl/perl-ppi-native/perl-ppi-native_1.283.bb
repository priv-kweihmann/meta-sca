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

SRC_URI[md5sum] = "63c7fa7ecc21abe2b560af760f20a1c2"
SRC_URI[sha256sum] = "70becc9dfad8a72d231bbe88d20a82acfd31c13ca03c6fb359703a5ac0004059"

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
