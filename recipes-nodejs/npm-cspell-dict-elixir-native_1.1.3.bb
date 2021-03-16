SUMMARY = "NPM: cspell-dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/elixir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acfbf4bfa9578f50e7ce529644121342"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-elixir/-/cspell-dict-elixir-1.1.3.tgz"
SRC_URI[md5sum] = "8962966cc09b37a76529af8077592da5"
SRC_URI[sha256sum] = "f2b17f9b5d5f51c73e25d6871aa7c6e4ca6da6eecbe4670165cd307acdd59552"

NPM_PKGNAME = "cspell-dict-elixir"

inherit npmhelper
inherit native
