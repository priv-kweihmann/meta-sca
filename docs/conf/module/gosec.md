# Configuration for gosec

## Supported environments/languages

* GO

## NOTE

With the thud standard go-implementation you will get a compile issue, as gosec requires
go 1.12+. Enable this module only if you have a non-standard go installed in the build chain.

## Configuration

| var | purpose | type | default |
| ------------- |:-------------:| -----:| -----:
| SCA_BLACKLIST_gosec | Blacklist filter for this tool | space-separated-list | "linux-*"
| SCA_GOSEC_EXTRA_FATAL | Extra error-ids leading to build termination when found | space-separated-list | ""
| SCA_GOSEC_EXTRA_SUPPRESS | Extra error-ids to be suppressed | space-separated-list | ""
| SCA_GOSEC_FILE_FILTER | List of file-extensions to be checked | space-separated-list | ".go"

## Supports

- [x] suppression of ids
- [x] terminate build on fatal
- [x] run on recipe
- [ ] run on image
- [ ] run with SCA-layer default settings (see SCA_AVAILABLE_MODULES)

## Requires

- [ ] requires online access

## Known error-ids

* gosec.gosec.G101: Look for hardcoded credentials
* gosec.gosec.G102: Bind to all interfaces
* gosec.gosec.G103: Audit the use of unsafe block
* gosec.gosec.G104: Audit errors not checked
* gosec.gosec.G105: Audit the use of big.Exp function
* gosec.gosec.G106: Audit the use of ssh.InsecureIgnoreHostKey function
* gosec.gosec.G107: Url provided to HTTP request as taint input
* gosec.gosec.G201: SQL query construction using format string
* gosec.gosec.G202: SQL query construction using string concatenation
* gosec.gosec.G203: Use of unescaped data in HTML templates
* gosec.gosec.G204: Audit use of command execution
* gosec.gosec.G301: Poor file permissions used when creating a directory
* gosec.gosec.G302: Poor file permissions used when creation file or using chmod
* gosec.gosec.G303: Creating tempfile using a predictable path
* gosec.gosec.G304: File path provided as taint input
* gosec.gosec.G305: File path traversal when extracting zip archive
* gosec.gosec.G401: Detect the usage of DES, RC4, MD5 or SHA1
* gosec.gosec.G402: Look for bad TLS connection settings
* gosec.gosec.G403: Ensure minimum RSA key length of 2048 bits
* gosec.gosec.G404: Insecure random number source (rand)
* gosec.gosec.G501: Import blacklist: crypto/md5
* gosec.gosec.G502: Import blacklist: crypto/des
* gosec.gosec.G503: Import blacklist: crypto/rc4
* gosec.gosec.G504: Import blacklist: net/http/cgi

## Checking scope

- [x] security
- [ ] functional defects
- [ ] style issues

## Statistics

 - ⬛⬛⬛⬛⬛⬛⬜⬜⬜⬜ 06/10 Build Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬛⬛ 10/10 Execution Speed
 - ⬛⬛⬛⬛⬛⬛⬛⬛⬜⬜ 08/10 Quality

## Score mapping

### Error considered as security relevant

* gosec.gosec.*

### Error considered as functional defect

* n.a.

### Error considered as style issue

* n.a.
