SUMMARY = "Build.PL install path logic made easy"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::InstallPaths"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4109085ee02c4453f25d919938e72e96"

DEPENDS += "perl-extutils-config-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-InstallPaths-${PV}.tar.gz"

SRC_URI[md5sum] = "70f17a346e92560b5f5692119edbb161"
SRC_URI[sha256sum] = "7d64eb2dfa87ead010cdf55c8a1bdfde50b7b5852d7cb8cf2304f55bea2eb007"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/ExtUtils-InstallPaths-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
