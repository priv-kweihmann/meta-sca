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

SRC_URI[md5sum] = "dda3e4d5542a42d7dc102523fda81bd3"
SRC_URI[sha256sum] = "87c79f83b6876e206051965d5019d2507c551f819a86750080ec7ec43b2e0af8"

S = "${WORKDIR}/PPI-${PV}"

inherit cpan
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-perl-clone \
    nativesdk-perl-io-string \
    nativesdk-perl-params-util \
    nativesdk-perl-task-weaken \
"
