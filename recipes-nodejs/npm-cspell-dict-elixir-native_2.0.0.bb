SUMMARY = "NPM: @cspell/dict-elixir"
DESCRIPTION = "Elixir dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/elixir#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=acfbf4bfa9578f50e7ce529644121342"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-elixir/-/dict-elixir-2.0.0.tgz"
SRC_URI[md5sum] = "948783ede3099268d7dcb2b070bdc853"
SRC_URI[sha256sum] = "488e2d266fcdd0a9acfc36200b67b74d9e93e8738f87894435aa7884422b4218"

NPM_PKGNAME = "@cspell/dict-elixir"

inherit npmhelper
inherit native
