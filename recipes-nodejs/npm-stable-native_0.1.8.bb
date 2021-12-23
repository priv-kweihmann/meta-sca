SUMMARY = "NPM: stable"
DESCRIPTION = "A stable array sort for JavaScript"
HOMEPAGE = "https://github.com/Two-Screen/stable#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=67;md5=cb7af49f3d243cc3e75327109cf3c996"

SRC_URI = "https://registry.npmjs.org/stable/-/stable-0.1.8.tgz"
SRC_URI[md5sum] = "44a8d720766ede7ceb70b997856254d9"
SRC_URI[sha256sum] = "1d5f9321e96c34a4fe0b2d09dbcddef1edb896ccaea01d691a3a224ff2572bdb"

NPM_PKGNAME = "stable"

inherit npmhelper
inherit native
