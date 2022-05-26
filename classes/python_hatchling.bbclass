inherit setuptools3-base python_pep517

DEPENDS += "\
    python3-hatchling-native \
    python3-pathspec-native \
    python3-pluggy-native \
    python3-tomli-native \
    python3-wheel-native \
"

PEP517_BUILD_API = "hatchling.build"
