# Helper to create a trimmed down setup.py from information found in
# setup.cfg, in case there is no setup.py shipped with the sources

# this functionality can be safely removed once the pypa community
# comes up with a safe replacement for the functionality found in distutils3.bbclass

def distutils_legacy_package_name(d):
    # use pypi name or fall back to BPN
    return d.getVar("PYPI_PACKAGE") or d.getVar('BPN').replace('python-', '').replace('python3-', '')

DISTUTILS_LEGACY_VERSION ?= "${PV}"
DISTUTILS_LEGACY_NAME ?= "${@distutils_legacy_package_name(d)}"

python do_create_setup_py_legacy() {
    import os
    import glob

    if os.path.exists(os.path.join(d.getVar("SETUPTOOLS_SETUP_PATH"), "setup.py")):
        return

    from configparser import ConfigParser, NoOptionError, NoSectionError, ParsingError
    import re

    config = ConfigParser()
    try:
        config.read(os.path.join(d.getVar("SETUPTOOLS_SETUP_PATH"), "setup.cfg"))
    except FileNotFoundError:
        return

    def _strip(x):
        return re.sub(r"\s|\t|\n", "", x)

    def get_section(section):
        try:
            return dict(config.items(section=section))
        except (NoSectionError, ParsingError):
            return None

    def get_option(section, option):
        try:
            return config.get(section=section, option=option)
        except (NoOptionError, NoSectionError, ParsingError):
            return None

    def extract_bool(section, option, default):
        _option = get_option(section, option)
        if _option is None:
            return default
        return bool(_strip(_option))

    def extract_str(section, option, default):
        _option = get_option(section, option)
        if _option is None:
            return default
        return _strip(_option)

    def extract_dict_vallist(section, default, delim=""):
        _section = get_section(section)
        if _section is None:
            return default
        return {_strip(k): [_strip(x) for x in re.split(delim, v)] if delim else [ _strip(v) ] for k, v in _section.items()}

    def extract_dict(section, default):
        _section = get_section(section)
        if _section is None:
            return default
        return {_strip(k): _strip(v) for k, v in _section.items()}

    def extract_list(section, option, default, delim):
        _option = get_option(section, option)
        if _option is None:
            return default
        _listitems = re.split(delim, _option) if delim else [_option]
        return [_strip(x) for x in _listitems]

    def quote(x):
        return '"%s"' % x.strip('"')

    def find_packages(top):
        res = set()
        for p in glob.glob(os.path.join(top, "**", "__init__.py"), recursive=True):
            res.add(os.path.relpath(os.path.dirname(p), top).strip("/").replace("/", "."))
        return list(res)


    _pkginfo = {
        "entry_points": extract_dict_vallist("options.entry_points", {}),
        "include_package_data": extract_bool("options", "include_package_data", False),
        "name": quote(extract_str("options", "name", d.getVar("DISTUTILS_LEGACY_NAME"))),
        "package_data": extract_dict_vallist("options.package_data", {}, r"\s+|,"),
        "packages": extract_list("options", "packages", [], ""),
        "version": quote(d.getVar("DISTUTILS_LEGACY_VERSION")),
        "zip_safe": extract_bool("options", "zip_safe", False),
        "install_requires": extract_list("options", "install_requires", [], r"\t+|\n+"),
        "python_requires": quote(extract_str("options", "python_requires", ">0.0")),
        "package_dir": extract_dict("package_dir", {}),
        "py_modules": extract_list("options", "py_modules", [], r"\s+|,"),
    }

    # In case packages is using :find module
    # we need to look for top level directories containing a __init__.py
    if _pkginfo["packages"] == ["find:"] or _pkginfo["packages"] == ["find_namespace:"]:
        # top level search dir can be adjusted by options.packages.find option
        _path = extract_str("options.packages.find", "where", "")
        _pkginfo["packages"] = find_packages(os.path.join(d.getVar("SETUPTOOLS_SETUP_PATH"), _path))

    with open(os.path.join(d.getVar("SETUPTOOLS_SETUP_PATH"), "setup.py"), "w") as o:
        o.write("import setuptools\n")
        o.write("setuptools.setup(\n")
        for k, v in _pkginfo.items():
            o.write("%s = %s,\n" % (str(k), str(v)))
        o.write(")")

    
}

do_create_setup_py_legacy[doc] = "Create a fallback version of legacy setup.py if not existing"
addtask do_create_setup_py_legacy before do_configure after do_patch do_prepare_recipe_sysroot
