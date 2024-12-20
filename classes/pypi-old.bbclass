# a fixup class to allow also none compliant packages to be found
def pypi_normalize_alt(d):
    import re
    pkg = d.getVar('PYPI_PACKAGE')
    res = [d.getVar('UPSTREAM_CHECK_PYPI_PACKAGE')]
    for item in [(r"[-_.]+", "-"), (r"[-_]+", "-"), (r"[-_.]+", "_"), (r"[-_]+", "_")]:
        res.append(re.sub(item[0], item[1], pkg).lower())
    return res

UPSTREAM_CHECK_REGEX = "(${@'|'.join(pypi_normalize_alt(d))})-(?P<pver>(\d+[\.\-_]*)+).(tar\.gz|tgz|zip|tar\.bz2)"
