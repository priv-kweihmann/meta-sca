SUMMARY = "NPM: safer-buffer"
DESCRIPTION = "Modern Buffer API polyfill without footguns"
HOMEPAGE = "https://github.com/ChALkeR/safer-buffer#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e"

SRC_URI = "https://registry.npmjs.org/safer-buffer/-/safer-buffer-2.1.2.tgz"
SRC_URI[md5sum] = "1ea31bbc681f283e6148edd28904b3b3"
SRC_URI[sha256sum] = "78812f65ae3b98071ce1c9bacbe0666f4220d0b2753c2a11530eb27df440a3b3"

S = "${WORKDIR}/package"

NPM_PKGNAME = "safer-buffer"

inherit npmhelper
inherit native
