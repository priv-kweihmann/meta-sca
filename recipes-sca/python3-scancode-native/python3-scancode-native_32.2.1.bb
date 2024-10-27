SUMMARY = "ScanCode is a tool to scan code for license, copyright"
HOMEPAGE = "https://github.com/nexB/scancode-toolkit"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CC-BY-SA-4.0 & Apache-2.0"
LIC_FILES_CHKSUM = "\
                    file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://cc-by-4.0.LICENSE;md5=c2b69cea79405efd14cca910fbc5c070 \
                    "

DEPENDS += "\
        python3-attrs-native \
        python3-banal-native \
        python3-beautifulsoup4-native \
        python3-binaryornot-native \
        python3-booleanpy-native \
        python3-certifi-native \
        python3-cffi-native \
        python3-chardet-native \
        python3-charset-normalizer-native \
        python3-click-native \
        python3-colorama-native \
        python3-commoncode-native \
        python3-construct-native \
        python3-container-inspector-native \
        python3-cryptography-native \
        python3-debian-inspector-native \
        python3-dockerfile-parse-native \
        python3-dparse-native \
        python3-extractcode-7z-system-provided-native \
        python3-extractcode-libarchive-system-provided-native \
        python3-extractcode-native \
        python3-fasteners-native \
        python3-fingerprints-native \
        python3-ftfy-native \
        python3-gemfileparser-native \
        python3-html5lib-native \
        python3-idna-native \
        python3-inflection-native \
        python3-intbitset-native \
        python3-isodate-native \
        python3-jaraco-functools-native \
        python3-javaproperties-native \
        python3-jinja2-native \
        python3-jsonstreams-native \
        python3-license-expression-native \
        python3-lxml-native \
        python3-markupsafe-native \
        python3-more-itertools-native \
        python3-normality-native \
        python3-packageurl-python-native \
        python3-packaging-native \
        python3-packvers-native \
        python3-parameter-expansion-patched-native \
        python3-pdfminer-six-native \
        python3-pefile-native \
        python3-pip-requirements-parser-native \
        python3-pkginfo-native \
        python3-pluggy-native \
        python3-plugincode-native \
        python3-ply-native \
        python3-publicsuffix2-native \
        python3-pyahocorasick-native \
        python3-pycparser-native \
        python3-pygmars-native \
        python3-pygments-native \
        python3-pymaven-patch-native \
        python3-pyparsing-native \
        python3-pytz-native \
        python3-pyyaml-native \
        python3-rdflib-native \
        python3-requests-native \
        python3-saneyaml-native \
        python3-six-native \
        python3-soupsieve-native \
        python3-spdx-tools-native \
        python3-text-unidecode-native \
        python3-toml-native \
        python3-typecode-libmagic-system-provided-native \
        python3-typecode-native \
        python3-typing-extensions-native \
        python3-urllib3-native \
        python3-urlpy-native \
        python3-wcwidth-native \
        python3-webencodings-native \
        python3-xmltodict-native \
        python3-zipp-native \
        "

SRC_URI = "git://github.com/nexB/scancode-toolkit.git;protocol=https;nobranch=1"
SRCREV = "e26187aee6bfece5b0f0a134bacd5d1d86f5172a"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit sca-description
inherit python_setuptools_build_meta
inherit_defer native

SCA_TOOL_DESCRIPTION = "scancode"
