SUMMARY = "Facility for creating read-only scalars, arrays, hashes"
HOMEPAGE = "https://metacpan.org/pod/Readonly"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e8c884908ae9d75a4adb8a3f746f04e6"

DEPENDS += "perl-module-build-tiny-native"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SANKO/Readonly-${PV}.tar.gz"

SRC_URI[md5sum] = "acae851d7d55c509f5f00a8849597e54"
SRC_URI[sha256sum] = "4b23542491af010d44a5c7c861244738acc74ababae6b8838d354dfb19462b5e"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Readonly-${PV}"

inherit cpan_build
inherit cpan-fixups
inherit_defer nativesdk

do_install:append() {
    # Remove .packlist file, as it contains host specific paths
    # and doesn't serve a real purpose
    find ${D} -name ".packlist" -delete
}
