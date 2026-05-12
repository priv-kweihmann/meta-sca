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

SRC_URI[md5sum] = "0713d4677fb9f8b9a93a9d6b75bb5615"
SRC_URI[sha256sum] = "74ac10bf66443ea813fb37d2ff5219c4d8e685379272d6699c812a39d91f3c1d"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPI-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-perl-clone \
    nativesdk-perl-io-string \
    nativesdk-perl-params-util \
    nativesdk-perl-task-weaken \
"
