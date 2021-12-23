SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/elixir#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acfbf4bfa9578f50e7ce529644121342"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.1.4.tgz"
SRC_URI[md5sum] = "3804db09f9517196960cdfdc1bfa06ff"
SRC_URI[sha256sum] = "a793c76beeed5d44fa970050e75337f566135aadc01cf7e4a0bf5e8ace04d46c"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
