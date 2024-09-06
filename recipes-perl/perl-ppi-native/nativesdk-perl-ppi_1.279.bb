SUMMARY = "Parse, Analyze and Manipulate Perl (without perl)"
HOMEPAGE = "https://metacpan.org/pod/PPI"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=d41d8cd98f00b204e9800998ecf8427e"

DEPENDS += "\
    nativesdk-perl-clone \
    nativesdk-perl-io-string \
    nativesdk-perl-params-util \
    nativesdk-perl-task-weaken \
"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MI/MITHALDU/PPI-${PV}.tar.gz"

SRC_URI[md5sum] = "a29c3bd660070a30dc6f1d4773d3ed98"
SRC_URI[sha256sum] = "f69f4cc2c56d6e92183b80b1dd7337957623c509377ad5578edf1a3b467efa5a"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/PPI-${PV}"

inherit cpan
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-perl-clone \
    nativesdk-perl-io-string \
    nativesdk-perl-params-util \
    nativesdk-perl-task-weaken \
"
