# a fixup class to allow also none compliant packages to be found

def pypi_escape_packagename(d):
    import re
    return re.sub(r"[-_.]+", "_", d.getVar('PYPI_PACKAGE'))

PYPI_ESCAPE_PACKAGE_NAME ?= "1"
PYPI_LOWERCASE_PACKAGE_NAME ?= "${PYPI_ESCAPE_PACKAGE_NAME}"

def pypi_src_uri_patched(d):
    if d.getVar('PYPI_ESCAPE_PACKAGE_NAME') == '1':
        package = pypi_escape_packagename(d)
    else:
        package = d.getVar('PYPI_PACKAGE')
    if d.getVar('PYPI_LOWERCASE_PACKAGE_NAME') == '1':
        package = package.lower()
    archive_name = package + d.expand('-${PV}.${PYPI_PACKAGE_EXT}')
    archive_downloadname = d.getVar('PYPI_ARCHIVE_NAME_PREFIX') + archive_name
    return 'https://files.pythonhosted.org/packages/source/%s/%s/%s;downloadfilename=%s' % (package[0].lower(), package, archive_name, archive_downloadname)

def pypi_src_workspace(d):
    if d.getVar('PYPI_ESCAPE_PACKAGE_NAME') == '1':
        package = pypi_escape_packagename(d)
    else:
        package = d.getVar('PYPI_PACKAGE')
    if d.getVar('PYPI_LOWERCASE_PACKAGE_NAME') == '1':
        package = package.lower()
    return d.expand("${WORKDIR}/%s-${PV}" % package)

PYPI_SRC_URI = "${@pypi_src_uri_patched(d)}"
S = "${@pypi_src_workspace(d)}"

def pypi_normalize_alt(d):
    import re
    pkg = d.getVar('PYPI_PACKAGE')
    res = [d.getVar('UPSTREAM_CHECK_PYPI_PACKAGE')]
    for item in [(r"[-_.]+", "-"), (r"[-_]+", "-"), (r"[-_.]+", "_"), (r"[-_]+", "_")]:
        res.append(re.sub(item[0], item[1], pkg).lower())
    for item in [(r"[-_.]+", "-"), (r"[-_]+", "-"), (r"[-_.]+", "_"), (r"[-_]+", "_")]:
        res.append(re.sub(item[0], item[1], pkg))
    return res

UPSTREAM_CHECK_REGEX = "(${@'|'.join(pypi_normalize_alt(d))})-(?P<pver>(\d+[\.\-_]*)+).(tar\.gz|tgz|zip|tar\.bz2)"
