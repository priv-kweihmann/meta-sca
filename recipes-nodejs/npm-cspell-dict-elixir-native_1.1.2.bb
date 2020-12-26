SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acfbf4bfa9578f50e7ce529644121342"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.1.2.tgz"
SRC_URI[md5sum] = "ef7be009c5061cdbd3d870780d0f81e4"
SRC_URI[sha256sum] = "3e5ecf361f96e560cf888f94e24f8ee6411961bae6c807ff97528bafafe73c6c"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
