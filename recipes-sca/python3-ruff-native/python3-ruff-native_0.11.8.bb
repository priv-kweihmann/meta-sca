SUMMARY = "An extremely fast Python linter"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f9a63dd89863fb66a18c35f56c4b8bc"

PYPI_PACKAGE = "ruff"

CRATES_LIST = "\
    crate://crates.io/adler2/2.0.0 \
    crate://crates.io/aho-corasick/1.1.3 \
    crate://crates.io/allocator-api2/0.2.21 \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anes/0.1.6 \
    crate://crates.io/annotate-snippets/0.11.5 \
    crate://crates.io/anstream/0.6.18 \
    crate://crates.io/anstyle-lossy/1.1.3 \
    crate://crates.io/anstyle-parse/0.2.6 \
    crate://crates.io/anstyle-query/1.1.2 \
    crate://crates.io/anstyle-svg/0.1.7 \
    crate://crates.io/anstyle-wincon/3.0.7 \
    crate://crates.io/anstyle/1.0.10 \
    crate://crates.io/anyhow/1.0.98 \
    crate://crates.io/argfile/0.2.1 \
    crate://crates.io/arrayvec/0.7.6 \
    crate://crates.io/assert_fs/1.1.2 \
    crate://crates.io/autocfg/1.4.0 \
    crate://crates.io/base64/0.13.1 \
    crate://crates.io/bincode/1.3.3 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bitflags/2.9.0 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/boxcar/0.2.11 \
    crate://crates.io/bstr/1.12.0 \
    crate://crates.io/bumpalo/3.17.0 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/cachedir/0.3.1 \
    crate://crates.io/camino/1.1.9 \
    crate://crates.io/cast/0.3.0 \
    crate://crates.io/castaway/0.2.3 \
    crate://crates.io/cc/1.2.16 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/cfg_aliases/0.2.1 \
    crate://crates.io/chrono/0.4.40 \
    crate://crates.io/ciborium-io/0.2.2 \
    crate://crates.io/ciborium-ll/0.2.2 \
    crate://crates.io/ciborium/0.2.2 \
    crate://crates.io/clap/4.5.37 \
    crate://crates.io/clap_builder/4.5.37 \
    crate://crates.io/clap_complete/4.5.46 \
    crate://crates.io/clap_complete_command/0.6.1 \
    crate://crates.io/clap_complete_nushell/4.5.5 \
    crate://crates.io/clap_derive/4.5.32 \
    crate://crates.io/clap_lex/0.7.4 \
    crate://crates.io/clearscreen/4.0.1 \
    crate://crates.io/codspeed-criterion-compat-walltime/2.9.1 \
    crate://crates.io/codspeed-criterion-compat/2.9.1 \
    crate://crates.io/codspeed/2.9.1 \
    crate://crates.io/colorchoice/1.0.3 \
    crate://crates.io/colored/2.2.0 \
    crate://crates.io/colored/3.0.0 \
    crate://crates.io/compact_str/0.9.0 \
    crate://crates.io/console/0.15.11 \
    crate://crates.io/console_error_panic_hook/0.1.7 \
    crate://crates.io/console_log/1.0.0 \
    crate://crates.io/core-foundation-sys/0.8.7 \
    crate://crates.io/countme/3.0.1 \
    crate://crates.io/cpufeatures/0.2.17 \
    crate://crates.io/crc32fast/1.4.2 \
    crate://crates.io/criterion-plot/0.5.0 \
    crate://crates.io/criterion/0.5.1 \
    crate://crates.io/crossbeam-channel/0.5.14 \
    crate://crates.io/crossbeam-deque/0.8.6 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-queue/0.3.12 \
    crate://crates.io/crossbeam-utils/0.8.21 \
    crate://crates.io/crossbeam/0.8.4 \
    crate://crates.io/crunchy/0.2.3 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/ctrlc/3.4.6 \
    crate://crates.io/darling/0.20.10 \
    crate://crates.io/darling_core/0.20.10 \
    crate://crates.io/darling_macro/0.20.10 \
    crate://crates.io/dashmap/5.5.3 \
    crate://crates.io/dashmap/6.1.0 \
    crate://crates.io/diff/0.1.13 \
    crate://crates.io/difflib/0.4.0 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/dir-test-macros/0.4.1 \
    crate://crates.io/dir-test/0.4.1 \
    crate://crates.io/dirs-sys/0.4.1 \
    crate://crates.io/dirs/5.0.1 \
    crate://crates.io/displaydoc/0.2.5 \
    crate://crates.io/doc-comment/0.3.3 \
    crate://crates.io/drop_bomb/0.1.5 \
    crate://crates.io/dunce/1.0.5 \
    crate://crates.io/dyn-clone/1.0.19 \
    crate://crates.io/either/1.15.0 \
    crate://crates.io/encode_unicode/1.0.0 \
    crate://crates.io/env_filter/0.1.3 \
    crate://crates.io/env_home/0.1.0 \
    crate://crates.io/env_logger/0.11.8 \
    crate://crates.io/equivalent/1.0.2 \
    crate://crates.io/errno/0.3.10 \
    crate://crates.io/escape8259/0.5.3 \
    crate://crates.io/escargot/0.5.13 \
    crate://crates.io/etcetera/0.10.0 \
    crate://crates.io/fastrand/2.3.0 \
    crate://crates.io/fern/0.7.1 \
    crate://crates.io/filetime/0.2.25 \
    crate://crates.io/flate2/1.1.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foldhash/0.1.5 \
    crate://crates.io/form_urlencoded/1.2.1 \
    crate://crates.io/fs-err/2.11.0 \
    crate://crates.io/fsevent-sys/4.1.0 \
    crate://crates.io/generator/0.8.4 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getopts/0.2.21 \
    crate://crates.io/getrandom/0.2.15 \
    crate://crates.io/getrandom/0.3.2 \
    crate://crates.io/glob/0.3.2 \
    crate://crates.io/globset/0.4.16 \
    crate://crates.io/globwalk/0.9.1 \
    crate://crates.io/half/2.5.0 \
    crate://crates.io/hashbrown/0.14.5 \
    crate://crates.io/hashbrown/0.15.2 \
    crate://crates.io/hashlink/0.10.0 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/hermit-abi/0.3.9 \
    crate://crates.io/hermit-abi/0.5.0 \
    crate://crates.io/home/0.5.11 \
    crate://crates.io/html-escape/0.2.13 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.61 \
    crate://crates.io/icu_collections/1.5.0 \
    crate://crates.io/icu_locid/1.5.0 \
    crate://crates.io/icu_locid_transform/1.5.0 \
    crate://crates.io/icu_locid_transform_data/1.5.0 \
    crate://crates.io/icu_normalizer/1.5.0 \
    crate://crates.io/icu_normalizer_data/1.5.0 \
    crate://crates.io/icu_properties/1.5.1 \
    crate://crates.io/icu_properties_data/1.5.0 \
    crate://crates.io/icu_provider/1.5.0 \
    crate://crates.io/icu_provider_macros/1.5.0 \
    crate://crates.io/ident_case/1.0.1 \
    crate://crates.io/idna/1.0.3 \
    crate://crates.io/idna_adapter/1.2.0 \
    crate://crates.io/ignore/0.4.23 \
    crate://crates.io/imara-diff/0.1.8 \
    crate://crates.io/imperative/1.0.6 \
    crate://crates.io/indexmap/2.9.0 \
    crate://crates.io/indicatif/0.17.11 \
    crate://crates.io/indoc/2.0.6 \
    crate://crates.io/inotify-sys/0.1.5 \
    crate://crates.io/inotify/0.11.0 \
    crate://crates.io/insta-cmd/0.6.0 \
    crate://crates.io/insta/1.42.2 \
    crate://crates.io/is-docker/0.2.0 \
    crate://crates.io/is-macro/0.3.7 \
    crate://crates.io/is-terminal/0.4.16 \
    crate://crates.io/is-wsl/0.4.0 \
    crate://crates.io/is_terminal_polyfill/1.70.1 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itertools/0.13.0 \
    crate://crates.io/itertools/0.14.0 \
    crate://crates.io/itoa/1.0.15 \
    crate://crates.io/jiff-static/0.2.10 \
    crate://crates.io/jiff-tzdb-platform/0.1.3 \
    crate://crates.io/jiff-tzdb/0.1.4 \
    crate://crates.io/jiff/0.2.10 \
    crate://crates.io/jobserver/0.1.32 \
    crate://crates.io/jod-thread/0.1.2 \
    crate://crates.io/js-sys/0.3.77 \
    crate://crates.io/kqueue-sys/1.0.4 \
    crate://crates.io/kqueue/1.0.8 \
    crate://crates.io/lazy_static/1.5.0 \
    crate://crates.io/libc/0.2.172 \
    crate://crates.io/libcst/1.7.0 \
    crate://crates.io/libcst_derive/1.7.0 \
    crate://crates.io/libmimalloc-sys/0.1.42 \
    crate://crates.io/libredox/0.1.3 \
    crate://crates.io/libtest-mimic/0.7.3 \
    crate://crates.io/linked-hash-map/0.5.6 \
    crate://crates.io/linux-raw-sys/0.4.15 \
    crate://crates.io/linux-raw-sys/0.9.3 \
    crate://crates.io/litemap/0.7.5 \
    crate://crates.io/lock_api/0.4.12 \
    crate://crates.io/log/0.4.27 \
    crate://crates.io/loom/0.7.2 \
    crate://crates.io/lsp-server/0.7.8 \
    crate://crates.io/matchers/0.1.0 \
    crate://crates.io/matches/0.1.10 \
    crate://crates.io/matchit/0.8.6 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/mimalloc/0.1.46 \
    crate://crates.io/minicov/0.3.7 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/miniz_oxide/0.8.5 \
    crate://crates.io/mio/1.0.3 \
    crate://crates.io/natord/1.0.9 \
    crate://crates.io/newtype-uuid/1.2.1 \
    crate://crates.io/nix/0.29.0 \
    crate://crates.io/nom/7.1.3 \
    crate://crates.io/normalize-line-endings/0.3.0 \
    crate://crates.io/notify-types/2.0.0 \
    crate://crates.io/notify/8.0.0 \
    crate://crates.io/nu-ansi-term/0.46.0 \
    crate://crates.io/nu-ansi-term/0.50.1 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/num_cpus/1.16.0 \
    crate://crates.io/number_prefix/0.4.0 \
    crate://crates.io/once_cell/1.21.1 \
    crate://crates.io/oorandom/11.1.5 \
    crate://crates.io/option-ext/0.2.0 \
    crate://crates.io/ordermap/0.5.7 \
    crate://crates.io/os_pipe/1.2.1 \
    crate://crates.io/os_str_bytes/7.1.0 \
    crate://crates.io/overload/0.1.1 \
    crate://crates.io/parking_lot/0.12.3 \
    crate://crates.io/parking_lot_core/0.9.10 \
    crate://crates.io/paste/1.0.15 \
    crate://crates.io/path-absolutize/3.1.1 \
    crate://crates.io/path-dedot/3.1.1 \
    crate://crates.io/path-slash/0.2.1 \
    crate://crates.io/pathdiff/0.2.3 \
    crate://crates.io/peg-macros/0.8.5 \
    crate://crates.io/peg-runtime/0.8.5 \
    crate://crates.io/peg/0.8.5 \
    crate://crates.io/pep440_rs/0.7.3 \
    crate://crates.io/pep508_rs/0.9.2 \
    crate://crates.io/percent-encoding/2.3.1 \
    crate://crates.io/pest/2.7.15 \
    crate://crates.io/pest_derive/2.7.15 \
    crate://crates.io/pest_generator/2.7.15 \
    crate://crates.io/pest_meta/2.7.15 \
    crate://crates.io/phf/0.11.3 \
    crate://crates.io/phf_codegen/0.11.3 \
    crate://crates.io/phf_generator/0.11.3 \
    crate://crates.io/phf_shared/0.11.3 \
    crate://crates.io/pin-project-internal/1.1.10 \
    crate://crates.io/pin-project-lite/0.2.16 \
    crate://crates.io/pin-project/1.1.10 \
    crate://crates.io/pkg-config/0.3.32 \
    crate://crates.io/portable-atomic-util/0.2.4 \
    crate://crates.io/portable-atomic/1.11.0 \
    crate://crates.io/ppv-lite86/0.2.21 \
    crate://crates.io/predicates-core/1.0.9 \
    crate://crates.io/predicates-tree/1.0.12 \
    crate://crates.io/predicates/3.1.3 \
    crate://crates.io/pretty_assertions/1.4.1 \
    crate://crates.io/proc-macro2/1.0.95 \
    crate://crates.io/pyproject-toml/0.13.4 \
    crate://crates.io/quick-junit/0.5.1 \
    crate://crates.io/quick-xml/0.37.2 \
    crate://crates.io/quickcheck/1.0.3 \
    crate://crates.io/quickcheck_macros/1.0.0 \
    crate://crates.io/quote/1.0.40 \
    crate://crates.io/r-efi/5.2.0 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand/0.9.1 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_chacha/0.9.0 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/rand_core/0.9.3 \
    crate://crates.io/rayon-core/1.12.1 \
    crate://crates.io/rayon/1.10.0 \
    crate://crates.io/redox_syscall/0.5.10 \
    crate://crates.io/redox_users/0.4.6 \
    crate://crates.io/regex-automata/0.1.10 \
    crate://crates.io/regex-automata/0.4.9 \
    crate://crates.io/regex-syntax/0.6.29 \
    crate://crates.io/regex-syntax/0.8.5 \
    crate://crates.io/regex/1.11.1 \
    crate://crates.io/ron/0.7.1 \
    crate://crates.io/rust-stemmers/1.2.0 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/rustc-hash/2.1.1 \
    crate://crates.io/rustix/0.38.44 \
    crate://crates.io/rustix/1.0.2 \
    crate://crates.io/rustversion/1.0.20 \
    crate://crates.io/ryu/1.0.20 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schemars/0.8.22 \
    crate://crates.io/schemars_derive/0.8.22 \
    crate://crates.io/scoped-tls/1.0.1 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/seahash/4.1.0 \
    crate://crates.io/serde-wasm-bindgen/0.6.5 \
    crate://crates.io/serde/1.0.219 \
    crate://crates.io/serde_derive/1.0.219 \
    crate://crates.io/serde_derive_internals/0.29.1 \
    crate://crates.io/serde_json/1.0.140 \
    crate://crates.io/serde_repr/0.1.20 \
    crate://crates.io/serde_spanned/0.6.8 \
    crate://crates.io/serde_test/1.0.177 \
    crate://crates.io/serde_with/3.12.0 \
    crate://crates.io/serde_with_macros/3.12.0 \
    crate://crates.io/sha2/0.10.8 \
    crate://crates.io/sharded-slab/0.1.7 \
    crate://crates.io/shellexpand/3.1.1 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/similar/2.7.0 \
    crate://crates.io/siphasher/1.0.1 \
    crate://crates.io/smallvec/1.15.0 \
    crate://crates.io/snapbox-macros/0.3.10 \
    crate://crates.io/snapbox/0.6.21 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strip-ansi-escapes/0.2.1 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/strum/0.27.1 \
    crate://crates.io/strum_macros/0.27.1 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.101 \
    crate://crates.io/synstructure/0.13.1 \
    crate://crates.io/tempfile/3.19.1 \
    crate://crates.io/termcolor/1.4.1 \
    crate://crates.io/terminal_size/0.4.2 \
    crate://crates.io/terminfo/0.9.0 \
    crate://crates.io/termtree/0.5.1 \
    crate://crates.io/test-case-core/3.3.1 \
    crate://crates.io/test-case-macros/3.3.1 \
    crate://crates.io/test-case/3.3.1 \
    crate://crates.io/thin-vec/0.2.14 \
    crate://crates.io/thiserror-impl/1.0.69 \
    crate://crates.io/thiserror-impl/2.0.12 \
    crate://crates.io/thiserror/1.0.69 \
    crate://crates.io/thiserror/2.0.12 \
    crate://crates.io/thread_local/1.1.8 \
    crate://crates.io/threadpool/1.8.1 \
    crate://crates.io/tikv-jemalloc-sys/0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7 \
    crate://crates.io/tikv-jemallocator/0.6.0 \
    crate://crates.io/tinystr/0.7.6 \
    crate://crates.io/tinytemplate/1.2.1 \
    crate://crates.io/tinyvec/1.9.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/toml/0.8.20 \
    crate://crates.io/toml_datetime/0.6.8 \
    crate://crates.io/toml_edit/0.22.24 \
    crate://crates.io/tracing-attributes/0.1.28 \
    crate://crates.io/tracing-core/0.1.33 \
    crate://crates.io/tracing-flame/0.2.0 \
    crate://crates.io/tracing-indicatif/0.3.9 \
    crate://crates.io/tracing-log/0.2.0 \
    crate://crates.io/tracing-subscriber/0.3.19 \
    crate://crates.io/tracing-tree/0.4.0 \
    crate://crates.io/tracing/0.1.41 \
    crate://crates.io/tryfn/0.2.3 \
    crate://crates.io/typed-arena/2.0.2 \
    crate://crates.io/typenum/1.18.0 \
    crate://crates.io/ucd-trie/0.1.7 \
    crate://crates.io/unic-char-property/0.9.0 \
    crate://crates.io/unic-char-range/0.9.0 \
    crate://crates.io/unic-common/0.9.0 \
    crate://crates.io/unic-ucd-category/0.9.0 \
    crate://crates.io/unic-ucd-version/0.9.0 \
    crate://crates.io/unicode-ident/1.0.18 \
    crate://crates.io/unicode-normalization/0.1.24 \
    crate://crates.io/unicode-width/0.1.14 \
    crate://crates.io/unicode-width/0.2.0 \
    crate://crates.io/unicode_names2/1.3.0 \
    crate://crates.io/unicode_names2_generator/1.3.0 \
    crate://crates.io/unscanny/0.1.0 \
    crate://crates.io/url/2.5.4 \
    crate://crates.io/urlencoding/2.1.3 \
    crate://crates.io/utf16_iter/1.0.5 \
    crate://crates.io/utf8-width/0.1.7 \
    crate://crates.io/utf8_iter/1.0.4 \
    crate://crates.io/utf8parse/0.2.2 \
    crate://crates.io/uuid-macro-internal/1.16.0 \
    crate://crates.io/uuid/1.16.0 \
    crate://crates.io/valuable/0.1.1 \
    crate://crates.io/version-ranges/0.1.1 \
    crate://crates.io/version_check/0.9.5 \
    crate://crates.io/vt100/0.15.2 \
    crate://crates.io/vte/0.11.1 \
    crate://crates.io/vte/0.14.1 \
    crate://crates.io/vte_generate_state_changes/0.1.2 \
    crate://crates.io/wait-timeout/0.2.1 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.14.2+wasi-0.2.4 \
    crate://crates.io/wasm-bindgen-backend/0.2.100 \
    crate://crates.io/wasm-bindgen-futures/0.4.50 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.100 \
    crate://crates.io/wasm-bindgen-macro/0.2.100 \
    crate://crates.io/wasm-bindgen-shared/0.2.100 \
    crate://crates.io/wasm-bindgen-test-macro/0.3.50 \
    crate://crates.io/wasm-bindgen-test/0.3.50 \
    crate://crates.io/wasm-bindgen/0.2.100 \
    crate://crates.io/web-sys/0.3.77 \
    crate://crates.io/web-time/1.1.0 \
    crate://crates.io/which/7.0.2 \
    crate://crates.io/wild/2.2.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.9 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-core/0.58.0 \
    crate://crates.io/windows-implement/0.58.0 \
    crate://crates.io/windows-interface/0.58.0 \
    crate://crates.io/windows-link/0.1.0 \
    crate://crates.io/windows-result/0.2.0 \
    crate://crates.io/windows-strings/0.1.0 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.59.0 \
    crate://crates.io/windows-targets/0.48.5 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows/0.58.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.48.5 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.48.5 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.48.5 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.48.5 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.5 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.48.5 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
    crate://crates.io/winnow/0.7.4 \
    crate://crates.io/winsafe/0.0.19 \
    crate://crates.io/wit-bindgen-rt/0.39.0 \
    crate://crates.io/write16/1.0.0 \
    crate://crates.io/writeable/0.5.5 \
    crate://crates.io/yansi/1.0.1 \
    crate://crates.io/yoke-derive/0.7.5 \
    crate://crates.io/yoke/0.7.5 \
    crate://crates.io/zerocopy-derive/0.8.23 \
    crate://crates.io/zerocopy/0.8.23 \
    crate://crates.io/zerofrom-derive/0.1.6 \
    crate://crates.io/zerofrom/0.1.6 \
    crate://crates.io/zerovec-derive/0.10.3 \
    crate://crates.io/zerovec/0.10.4 \
    crate://crates.io/zip/0.6.6 \
    crate://crates.io/zstd-safe/5.0.2+zstd.1.5.2 \
    crate://crates.io/zstd-sys/2.0.14+zstd.1.5.7 \
    crate://crates.io/zstd/0.11.2+zstd.1.5.2 \
    git://github.com/astral-sh/lsp-types.git;protocol=https;rev=3512a9f33eadc5402cfab1b8f7340824c8ca1439;nobranch=1;destsuffix=cargo_home/bitbake/lsp-types-0.95.1 \
    git://github.com/salsa-rs/salsa.git;protocol=https;rev=42f15835c0005c4b37aaf5bc1a15e3e1b3df14b7;nobranch=1;destsuffix=cargo_home/bitbake/salsa-0.21.0 \
    git://github.com/salsa-rs/salsa.git;protocol=https;rev=42f15835c0005c4b37aaf5bc1a15e3e1b3df14b7;nobranch=1;destsuffix=cargo_home/bitbake/salsa-macro-rules-0.21.0 \
    git://github.com/salsa-rs/salsa.git;protocol=https;rev=42f15835c0005c4b37aaf5bc1a15e3e1b3df14b7;nobranch=1;destsuffix=cargo_home/bitbake/salsa-macros-0.21.0 \
"

SRC_URI[sha256sum] = "6d742d10626f9004b781f4558154bb226620a7242080e11caeffab1a40e99df8"

SRC_URI[adler2-2.0.0.sha256sum] = "512761e0bb2578dd7380c6baaa0f4ce03e84f95e960231d1dec8bf4d7d6e2627"
SRC_URI[aho-corasick-1.1.3.sha256sum] = "8e60d3430d3a69478ad0993f19238d2df97c507009a52b3c10addcd7f6bcb916"
SRC_URI[allocator-api2-0.2.21.sha256sum] = "683d7910e743518b0e34f1186f92494becacb047c7b6bf616c96772180fef923"
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[anes-0.1.6.sha256sum] = "4b46cbb362ab8752921c97e041f5e366ee6297bd428a31275b9fcf1e380f7299"
SRC_URI[annotate-snippets-0.11.5.sha256sum] = "710e8eae58854cdc1790fcb56cca04d712a17be849eeb81da2a724bf4bae2bc4"
SRC_URI[anstream-0.6.18.sha256sum] = "8acc5369981196006228e28809f761875c0327210a891e941f4c683b3a99529b"
SRC_URI[anstyle-1.0.10.sha256sum] = "55cc3b69f167a1ef2e161439aa98aed94e6028e5f9a59be9a6ffb47aef1651f9"
SRC_URI[anstyle-lossy-1.1.3.sha256sum] = "934ff8719effd2023a48cf63e69536c1c3ced9d3895068f6f5cc9a4ff845e59b"
SRC_URI[anstyle-parse-0.2.6.sha256sum] = "3b2d16507662817a6a20a9ea92df6652ee4f94f914589377d69f3b21bc5798a9"
SRC_URI[anstyle-query-1.1.2.sha256sum] = "79947af37f4177cfead1110013d678905c37501914fba0efea834c3fe9a8d60c"
SRC_URI[anstyle-svg-0.1.7.sha256sum] = "d3607949e9f6de49ea4bafe12f5e4fd73613ebf24795e48587302a8cc0e4bb35"
SRC_URI[anstyle-wincon-3.0.7.sha256sum] = "ca3534e77181a9cc07539ad51f2141fe32f6c3ffd4df76db8ad92346b003ae4e"
SRC_URI[anyhow-1.0.98.sha256sum] = "e16d2d3311acee920a9eb8d33b8cbc1787ce4a264e85f964c2404b969bdcd487"
SRC_URI[argfile-0.2.1.sha256sum] = "0a1cc0ba69de57db40674c66f7cf2caee3981ddef084388482c95c0e2133e5e8"
SRC_URI[arrayvec-0.7.6.sha256sum] = "7c02d123df017efcdfbd739ef81735b36c5ba83ec3c59c80a9d7ecc718f92e50"
SRC_URI[assert_fs-1.1.2.sha256sum] = "7efdb1fdb47602827a342857666feb372712cbc64b414172bd6b167a02927674"
SRC_URI[autocfg-1.4.0.sha256sum] = "ace50bade8e6234aa140d9a2f552bbee1db4d353f69b8217bc503490fc1a9f26"
SRC_URI[base64-0.13.1.sha256sum] = "9e1b586273c5702936fe7b7d6896644d8be71e6314cfe09d3167c95f712589e8"
SRC_URI[bincode-1.3.3.sha256sum] = "b1f45e9417d87227c7a56d22e471c6206462cba514c7590c09aff4cf6d1ddcad"
SRC_URI[bitflags-1.3.2.sha256sum] = "bef38d45163c2f1dde094a7dfd33ccf595c92905c8f8f4fdc18d06fb1037718a"
SRC_URI[bitflags-2.9.0.sha256sum] = "5c8214115b7bf84099f1309324e63141d4c5d7cc26862f97a0a857dbefe165bd"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[boxcar-0.2.11.sha256sum] = "6740c6e2fc6360fa57c35214c7493826aee95993926092606f27c983b40837be"
SRC_URI[bstr-1.12.0.sha256sum] = "234113d19d0d7d613b40e86fb654acf958910802bcceab913a4f9e7cda03b1a4"
SRC_URI[bumpalo-3.17.0.sha256sum] = "1628fb46dfa0b37568d12e5edd512553eccf6a22a78e8bde00bb4aed84d5bdbf"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[cachedir-0.3.1.sha256sum] = "4703f3937077db8fa35bee3c8789343c1aec2585f0146f09d658d4ccc0e8d873"
SRC_URI[camino-1.1.9.sha256sum] = "8b96ec4966b5813e2c0507c1f86115c8c5abaadc3980879c3424042a02fd1ad3"
SRC_URI[cast-0.3.0.sha256sum] = "37b2a672a2cb129a2e41c10b1224bb368f9f37a2b16b612598138befd7b37eb5"
SRC_URI[castaway-0.2.3.sha256sum] = "0abae9be0aaf9ea96a3b1b8b1b55c602ca751eba1b1500220cea4ecbafe7c0d5"
SRC_URI[cc-1.2.16.sha256sum] = "be714c154be609ec7f5dad223a33bf1482fff90472de28f7362806e6d4832b8c"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[cfg_aliases-0.2.1.sha256sum] = "613afe47fcd5fac7ccf1db93babcb082c5994d996f20b8b159f2ad1658eb5724"
SRC_URI[chrono-0.4.40.sha256sum] = "1a7964611d71df112cb1730f2ee67324fcf4d0fc6606acbbe9bfe06df124637c"
SRC_URI[ciborium-0.2.2.sha256sum] = "42e69ffd6f0917f5c029256a24d0161db17cea3997d185db0d35926308770f0e"
SRC_URI[ciborium-io-0.2.2.sha256sum] = "05afea1e0a06c9be33d539b876f1ce3692f4afea2cb41f740e7743225ed1c757"
SRC_URI[ciborium-ll-0.2.2.sha256sum] = "57663b653d948a338bfb3eeba9bb2fd5fcfaecb9e199e87e1eda4d9e8b240fd9"
SRC_URI[clap-4.5.37.sha256sum] = "eccb054f56cbd38340b380d4a8e69ef1f02f1af43db2f0cc817a4774d80ae071"
SRC_URI[clap_builder-4.5.37.sha256sum] = "efd9466fac8543255d3b1fcad4762c5e116ffe808c8a3043d4263cd4fd4862a2"
SRC_URI[clap_complete-4.5.46.sha256sum] = "f5c5508ea23c5366f77e53f5a0070e5a84e51687ec3ef9e0464c86dc8d13ce98"
SRC_URI[clap_complete_command-0.6.1.sha256sum] = "da8e198c052315686d36371e8a3c5778b7852fc75cc313e4e11eeb7a644a1b62"
SRC_URI[clap_complete_nushell-4.5.5.sha256sum] = "c6a8b1593457dfc2fe539002b795710d022dc62a65bf15023f039f9760c7b18a"
SRC_URI[clap_derive-4.5.32.sha256sum] = "09176aae279615badda0765c0c0b3f6ed53f4709118af73cf4655d85d1530cd7"
SRC_URI[clap_lex-0.7.4.sha256sum] = "f46ad14479a25103f283c0f10005961cf086d8dc42205bb44c46ac563475dca6"
SRC_URI[clearscreen-4.0.1.sha256sum] = "8c41dc435a7b98e4608224bbf65282309f5403719df9113621b30f8b6f74e2f4"
SRC_URI[codspeed-2.9.1.sha256sum] = "60e744216bfa9add3b1f2505587cbbb837923232ed10963609f4a6e3cbd99c3e"
SRC_URI[codspeed-criterion-compat-2.9.1.sha256sum] = "d5926ca63222a35b9a2299adcaafecf596efe20a9a2048e4a81cb2fc3463b4a8"
SRC_URI[codspeed-criterion-compat-walltime-2.9.1.sha256sum] = "dbae4da05076cbc673e242400ac8f4353bdb686e48020edc6e36a5c36ae0878e"
SRC_URI[colorchoice-1.0.3.sha256sum] = "5b63caa9aa9397e2d9480a9b13673856c78d8ac123288526c37d7839f2a86990"
SRC_URI[colored-2.2.0.sha256sum] = "117725a109d387c937a1533ce01b450cbde6b88abceea8473c4d7a85853cda3c"
SRC_URI[colored-3.0.0.sha256sum] = "fde0e0ec90c9dfb3b4b1a0891a7dcd0e2bffde2f7efed5fe7c9bb00e5bfb915e"
SRC_URI[compact_str-0.9.0.sha256sum] = "3fdb1325a1cece981e8a296ab8f0f9b63ae357bd0784a9faaf548cc7b480707a"
SRC_URI[console-0.15.11.sha256sum] = "054ccb5b10f9f2cbf51eb355ca1d05c2d279ce1804688d0db74b4733a5aeafd8"
SRC_URI[console_error_panic_hook-0.1.7.sha256sum] = "a06aeb73f470f66dcdbf7223caeebb85984942f22f1adb2a088cf9668146bbbc"
SRC_URI[console_log-1.0.0.sha256sum] = "be8aed40e4edbf4d3b4431ab260b63fdc40f5780a4766824329ea0f1eefe3c0f"
SRC_URI[core-foundation-sys-0.8.7.sha256sum] = "773648b94d0e5d620f64f280777445740e61fe701025087ec8b57f45c791888b"
SRC_URI[countme-3.0.1.sha256sum] = "7704b5fdd17b18ae31c4c1da5a2e0305a2bf17b5249300a9ee9ed7b72114c636"
SRC_URI[cpufeatures-0.2.17.sha256sum] = "59ed5838eebb26a2bb2e58f6d5b5316989ae9d08bab10e0e6d103e656d1b0280"
SRC_URI[crc32fast-1.4.2.sha256sum] = "a97769d94ddab943e4510d138150169a2758b5ef3eb191a9ee688de3e23ef7b3"
SRC_URI[criterion-0.5.1.sha256sum] = "f2b12d017a929603d80db1831cd3a24082f8137ce19c69e6447f54f5fc8d692f"
SRC_URI[criterion-plot-0.5.0.sha256sum] = "6b50826342786a51a89e2da3a28f1c32b06e387201bc2d19791f622c673706b1"
SRC_URI[crossbeam-0.8.4.sha256sum] = "1137cd7e7fc0fb5d3c5a8678be38ec56e819125d8d7907411fe24ccb943faca8"
SRC_URI[crossbeam-channel-0.5.14.sha256sum] = "06ba6d68e24814cb8de6bb986db8222d3a027d15872cabc0d18817bc3c0e4471"
SRC_URI[crossbeam-deque-0.8.6.sha256sum] = "9dd111b7b7f7d55b72c0a6ae361660ee5853c9af73f70c3c2ef6858b950e2e51"
SRC_URI[crossbeam-epoch-0.9.18.sha256sum] = "5b82ac4a3c2ca9c3460964f020e1402edd5753411d7737aa39c3714ad1b5420e"
SRC_URI[crossbeam-queue-0.3.12.sha256sum] = "0f58bbc28f91df819d0aa2a2c00cd19754769c2fad90579b3592b1c9ba7a3115"
SRC_URI[crossbeam-utils-0.8.21.sha256sum] = "d0a5c400df2834b80a4c3327b3aad3a4c4cd4de0629063962b03235697506a28"
SRC_URI[crunchy-0.2.3.sha256sum] = "43da5946c66ffcc7745f48db692ffbb10a83bfe0afd96235c5c2a4fb23994929"
SRC_URI[crypto-common-0.1.6.sha256sum] = "1bfb12502f3fc46cca1bb51ac28df9d618d813cdc3d2f25b9fe775a34af26bb3"
SRC_URI[ctrlc-3.4.6.sha256sum] = "697b5419f348fd5ae2478e8018cb016c00a5881c7f46c717de98ffd135a5651c"
SRC_URI[darling-0.20.10.sha256sum] = "6f63b86c8a8826a49b8c21f08a2d07338eec8d900540f8630dc76284be802989"
SRC_URI[darling_core-0.20.10.sha256sum] = "95133861a8032aaea082871032f5815eb9e98cef03fa916ab4500513994df9e5"
SRC_URI[darling_macro-0.20.10.sha256sum] = "d336a2a514f6ccccaa3e09b02d41d35330c07ddf03a62165fcec10bb561c7806"
SRC_URI[dashmap-5.5.3.sha256sum] = "978747c1d849a7d2ee5e8adc0159961c48fb7e5db2f06af6723b80123bb53856"
SRC_URI[dashmap-6.1.0.sha256sum] = "5041cc499144891f3790297212f32a74fb938e5136a14943f338ef9e0ae276cf"
SRC_URI[diff-0.1.13.sha256sum] = "56254986775e3233ffa9c4d7d3faaf6d36a2c09d30b20687e9f88bc8bafc16c8"
SRC_URI[difflib-0.4.0.sha256sum] = "6184e33543162437515c2e2b48714794e37845ec9851711914eec9d308f6ebe8"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[dir-test-0.4.1.sha256sum] = "62c013fe825864f3e4593f36426c1fa7a74f5603f13ca8d1af7a990c1cd94a79"
SRC_URI[dir-test-macros-0.4.1.sha256sum] = "d42f54d7b4a6bc2400fe5b338e35d1a335787585375322f49c5d5fe7b243da7e"
SRC_URI[dirs-5.0.1.sha256sum] = "44c45a9d03d6676652bcb5e724c7e988de1acad23a711b5217ab9cbecbec2225"
SRC_URI[dirs-sys-0.4.1.sha256sum] = "520f05a5cbd335fae5a99ff7a6ab8627577660ee5cfd6a94a6a929b52ff0321c"
SRC_URI[displaydoc-0.2.5.sha256sum] = "97369cbbc041bc366949bc74d34658d6cda5621039731c6310521892a3a20ae0"
SRC_URI[doc-comment-0.3.3.sha256sum] = "fea41bba32d969b513997752735605054bc0dfa92b4c56bf1189f2e174be7a10"
SRC_URI[drop_bomb-0.1.5.sha256sum] = "9bda8e21c04aca2ae33ffc2fd8c23134f3cac46db123ba97bd9d3f3b8a4a85e1"
SRC_URI[dunce-1.0.5.sha256sum] = "92773504d58c093f6de2459af4af33faa518c13451eb8f2b5698ed3d36e7c813"
SRC_URI[dyn-clone-1.0.19.sha256sum] = "1c7a8fb8a9fbf66c1f703fe16184d10ca0ee9d23be5b4436400408ba54a95005"
SRC_URI[either-1.15.0.sha256sum] = "48c757948c5ede0e46177b7add2e67155f70e33c07fea8284df6576da70b3719"
SRC_URI[encode_unicode-1.0.0.sha256sum] = "34aa73646ffb006b8f5147f3dc182bd4bcb190227ce861fc4a4844bf8e3cb2c0"
SRC_URI[env_filter-0.1.3.sha256sum] = "186e05a59d4c50738528153b83b0b0194d3a29507dfec16eccd4b342903397d0"
SRC_URI[env_home-0.1.0.sha256sum] = "c7f84e12ccf0a7ddc17a6c41c93326024c42920d7ee630d04950e6926645c0fe"
SRC_URI[env_logger-0.11.8.sha256sum] = "13c863f0904021b108aa8b2f55046443e6b1ebde8fd4a15c399893aae4fa069f"
SRC_URI[equivalent-1.0.2.sha256sum] = "877a4ace8713b0bcf2a4e7eec82529c029f1d0619886d18145fea96c3ffe5c0f"
SRC_URI[errno-0.3.10.sha256sum] = "33d852cb9b869c2a9b3df2f71a3074817f01e1844f839a144f5fcef059a4eb5d"
SRC_URI[escape8259-0.5.3.sha256sum] = "5692dd7b5a1978a5aeb0ce83b7655c58ca8efdcb79d21036ea249da95afec2c6"
SRC_URI[escargot-0.5.13.sha256sum] = "05a3ac187a16b5382fef8c69fd1bad123c67b7cf3932240a2d43dcdd32cded88"
SRC_URI[etcetera-0.10.0.sha256sum] = "26c7b13d0780cb82722fd59f6f57f925e143427e4a75313a6c77243bf5326ae6"
SRC_URI[fastrand-2.3.0.sha256sum] = "37909eebbb50d72f9059c3b6d82c0463f2ff062c9e95845c43a6c9c0355411be"
SRC_URI[fern-0.7.1.sha256sum] = "4316185f709b23713e41e3195f90edef7fb00c3ed4adc79769cf09cc762a3b29"
SRC_URI[filetime-0.2.25.sha256sum] = "35c0522e981e68cbfa8c3f978441a5f34b30b96e146b33cd3359176b50fe8586"
SRC_URI[flate2-1.1.0.sha256sum] = "11faaf5a5236997af9848be0bef4db95824b1d534ebc64d0f0c6cf3e67bd38dc"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foldhash-0.1.5.sha256sum] = "d9c4f5dac5e15c24eb999c26181a6ca40b39fe946cbe4c263c7209467bc83af2"
SRC_URI[form_urlencoded-1.2.1.sha256sum] = "e13624c2627564efccf4934284bdd98cbaa14e79b0b5a141218e507b3a823456"
SRC_URI[fs-err-2.11.0.sha256sum] = "88a41f105fe1d5b6b34b2055e3dc59bb79b46b48b2040b9e6c7b4b5de097aa41"
SRC_URI[fsevent-sys-4.1.0.sha256sum] = "76ee7a02da4d231650c7cea31349b889be2f45ddb3ef3032d2ec8185f6313fd2"
SRC_URI[generator-0.8.4.sha256sum] = "cc6bd114ceda131d3b1d665eba35788690ad37f5916457286b32ab6fd3c438dd"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getopts-0.2.21.sha256sum] = "14dbbfd5c71d70241ecf9e6f13737f7b5ce823821063188d7e46c41d371eebd5"
SRC_URI[getrandom-0.2.15.sha256sum] = "c4567c8db10ae91089c99af84c68c38da3ec2f087c3f82960bcdbf3656b6f4d7"
SRC_URI[getrandom-0.3.2.sha256sum] = "73fea8450eea4bac3940448fb7ae50d91f034f941199fcd9d909a5a07aa455f0"
SRC_URI[glob-0.3.2.sha256sum] = "a8d1add55171497b4705a648c6b583acafb01d58050a51727785f0b2c8e0a2b2"
SRC_URI[globset-0.4.16.sha256sum] = "54a1028dfc5f5df5da8a56a73e6c153c9a9708ec57232470703592a3f18e49f5"
SRC_URI[globwalk-0.9.1.sha256sum] = "0bf760ebf69878d9fd8f110c89703d90ce35095324d1f1edcb595c63945ee757"
SRC_URI[half-2.5.0.sha256sum] = "7db2ff139bba50379da6aa0766b52fdcb62cb5b263009b09ed58ba604e14bbd1"
SRC_URI[hashbrown-0.14.5.sha256sum] = "e5274423e17b7c9fc20b6e7e208532f9b19825d82dfd615708b70edd83df41f1"
SRC_URI[hashbrown-0.15.2.sha256sum] = "bf151400ff0baff5465007dd2f3e717f3fe502074ca563069ce3a6629d07b289"
SRC_URI[hashlink-0.10.0.sha256sum] = "7382cf6263419f2d8df38c55d7da83da5c18aef87fc7a7fc1fb1e344edfe14c1"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[hermit-abi-0.3.9.sha256sum] = "d231dfb89cfffdbc30e7fc41579ed6066ad03abda9e567ccafae602b97ec5024"
SRC_URI[hermit-abi-0.5.0.sha256sum] = "fbd780fe5cc30f81464441920d82ac8740e2e46b29a6fad543ddd075229ce37e"
SRC_URI[home-0.5.11.sha256sum] = "589533453244b0995c858700322199b2becb13b627df2851f64a2775d024abcf"
SRC_URI[html-escape-0.2.13.sha256sum] = "6d1ad449764d627e22bfd7cd5e8868264fc9236e07c752972b4080cd351cb476"
SRC_URI[iana-time-zone-0.1.61.sha256sum] = "235e081f3925a06703c2d0117ea8b91f042756fd6e7a6e5d901e8ca1a996b220"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[icu_collections-1.5.0.sha256sum] = "db2fa452206ebee18c4b5c2274dbf1de17008e874b4dc4f0aea9d01ca79e4526"
SRC_URI[icu_locid-1.5.0.sha256sum] = "13acbb8371917fc971be86fc8057c41a64b521c184808a698c02acc242dbf637"
SRC_URI[icu_locid_transform-1.5.0.sha256sum] = "01d11ac35de8e40fdeda00d9e1e9d92525f3f9d887cdd7aa81d727596788b54e"
SRC_URI[icu_locid_transform_data-1.5.0.sha256sum] = "fdc8ff3388f852bede6b579ad4e978ab004f139284d7b28715f773507b946f6e"
SRC_URI[icu_normalizer-1.5.0.sha256sum] = "19ce3e0da2ec68599d193c93d088142efd7f9c5d6fc9b803774855747dc6a84f"
SRC_URI[icu_normalizer_data-1.5.0.sha256sum] = "f8cafbf7aa791e9b22bec55a167906f9e1215fd475cd22adfcf660e03e989516"
SRC_URI[icu_properties-1.5.1.sha256sum] = "93d6020766cfc6302c15dbbc9c8778c37e62c14427cb7f6e601d849e092aeef5"
SRC_URI[icu_properties_data-1.5.0.sha256sum] = "67a8effbc3dd3e4ba1afa8ad918d5684b8868b3b26500753effea8d2eed19569"
SRC_URI[icu_provider-1.5.0.sha256sum] = "6ed421c8a8ef78d3e2dbc98a973be2f3770cb42b606e3ab18d6237c4dfde68d9"
SRC_URI[icu_provider_macros-1.5.0.sha256sum] = "1ec89e9337638ecdc08744df490b221a7399bf8d164eb52a665454e60e075ad6"
SRC_URI[ident_case-1.0.1.sha256sum] = "b9e0384b61958566e926dc50660321d12159025e767c18e043daf26b70104c39"
SRC_URI[idna-1.0.3.sha256sum] = "686f825264d630750a544639377bae737628043f20d38bbc029e8f29ea968a7e"
SRC_URI[idna_adapter-1.2.0.sha256sum] = "daca1df1c957320b2cf139ac61e7bd64fed304c5040df000a745aa1de3b4ef71"
SRC_URI[ignore-0.4.23.sha256sum] = "6d89fd380afde86567dfba715db065673989d6253f42b88179abd3eae47bda4b"
SRC_URI[imara-diff-0.1.8.sha256sum] = "17d34b7d42178945f775e84bc4c36dde7c1c6cdfea656d3354d009056f2bb3d2"
SRC_URI[imperative-1.0.6.sha256sum] = "29a1f6526af721f9aec9ceed7ab8ebfca47f3399d08b80056c2acca3fcb694a9"
SRC_URI[indexmap-2.9.0.sha256sum] = "cea70ddb795996207ad57735b50c5982d8844f38ba9ee5f1aedcfb708a2aa11e"
SRC_URI[indicatif-0.17.11.sha256sum] = "183b3088984b400f4cfac3620d5e076c84da5364016b4f49473de574b2586235"
SRC_URI[indoc-2.0.6.sha256sum] = "f4c7245a08504955605670dbf141fceab975f15ca21570696aebe9d2e71576bd"
SRC_URI[inotify-0.11.0.sha256sum] = "f37dccff2791ab604f9babef0ba14fbe0be30bd368dc541e2b08d07c8aa908f3"
SRC_URI[inotify-sys-0.1.5.sha256sum] = "e05c02b5e89bff3b946cedeca278abc628fe811e604f027c45a8aa3cf793d0eb"
SRC_URI[insta-1.42.2.sha256sum] = "50259abbaa67d11d2bcafc7ba1d094ed7a0c70e3ce893f0d0997f73558cb3084"
SRC_URI[insta-cmd-0.6.0.sha256sum] = "ffeeefa927925cced49ccb01bf3e57c9d4cd132df21e576eb9415baeab2d3de6"
SRC_URI[is-docker-0.2.0.sha256sum] = "928bae27f42bc99b60d9ac7334e3a21d10ad8f1835a4e12ec3ec0464765ed1b3"
SRC_URI[is-macro-0.3.7.sha256sum] = "1d57a3e447e24c22647738e4607f1df1e0ec6f72e16182c4cd199f647cdfb0e4"
SRC_URI[is-terminal-0.4.16.sha256sum] = "e04d7f318608d35d4b61ddd75cbdaee86b023ebe2bd5a66ee0915f0bf93095a9"
SRC_URI[is-wsl-0.4.0.sha256sum] = "173609498df190136aa7dea1a91db051746d339e18476eed5ca40521f02d7aa5"
SRC_URI[is_terminal_polyfill-1.70.1.sha256sum] = "7943c866cc5cd64cbc25b2e01621d07fa8eb2a1a23160ee81ce38704e97b8ecf"
SRC_URI[itertools-0.10.5.sha256sum] = "b0fd2260e829bddf4cb6ea802289de2f86d6a7a690192fbe91b3f46e0f2c8473"
SRC_URI[itertools-0.13.0.sha256sum] = "413ee7dfc52ee1a4949ceeb7dbc8a33f2d6c088194d9f922fb8318faf1f01186"
SRC_URI[itertools-0.14.0.sha256sum] = "2b192c782037fadd9cfa75548310488aabdbf3d2da73885b31bd0abd03351285"
SRC_URI[itoa-1.0.15.sha256sum] = "4a5f13b858c8d314ee3e8f639011f7ccefe71f97f96e50151fb991f267928e2c"
SRC_URI[jiff-0.2.10.sha256sum] = "5a064218214dc6a10fbae5ec5fa888d80c45d611aba169222fc272072bf7aef6"
SRC_URI[jiff-static-0.2.10.sha256sum] = "199b7932d97e325aff3a7030e141eafe7f2c6268e1d1b24859b753a627f45254"
SRC_URI[jiff-tzdb-0.1.4.sha256sum] = "c1283705eb0a21404d2bfd6eef2a7593d240bc42a0bdb39db0ad6fa2ec026524"
SRC_URI[jiff-tzdb-platform-0.1.3.sha256sum] = "875a5a69ac2bab1a891711cf5eccbec1ce0341ea805560dcd90b7a2e925132e8"
SRC_URI[jobserver-0.1.32.sha256sum] = "48d1dbcbbeb6a7fec7e059840aa538bd62aaccf972c7346c4d9d2059312853d0"
SRC_URI[jod-thread-0.1.2.sha256sum] = "8b23360e99b8717f20aaa4598f5a6541efbe30630039fbc7706cf954a87947ae"
SRC_URI[js-sys-0.3.77.sha256sum] = "1cfaf33c695fc6e08064efbc1f72ec937429614f25eef83af942d0e227c3a28f"
SRC_URI[kqueue-1.0.8.sha256sum] = "7447f1ca1b7b563588a205fe93dea8df60fd981423a768bc1c0ded35ed147d0c"
SRC_URI[kqueue-sys-1.0.4.sha256sum] = "ed9625ffda8729b85e45cf04090035ac368927b8cebc34898e7c120f52e4838b"
SRC_URI[lazy_static-1.5.0.sha256sum] = "bbd2bcb4c963f2ddae06a2efc7e9f3591312473c50c6685e1f298068316e66fe"
SRC_URI[libc-0.2.172.sha256sum] = "d750af042f7ef4f724306de029d18836c26c1765a54a6a3f094cbd23a7267ffa"
SRC_URI[libcst-1.7.0.sha256sum] = "ad9e315e3f679e61b9095ffd5e509de78b8a4ea3bba9d772f6fb243209f808d4"
SRC_URI[libcst_derive-1.7.0.sha256sum] = "bfa96ed35d0dccc67cf7ba49350cb86de3dcb1d072a7ab28f99117f19d874953"
SRC_URI[libmimalloc-sys-0.1.42.sha256sum] = "ec9d6fac27761dabcd4ee73571cdb06b7022dc99089acbe5435691edffaac0f4"
SRC_URI[libredox-0.1.3.sha256sum] = "c0ff37bd590ca25063e35af745c343cb7a0271906fb7b37e4813e8f79f00268d"
SRC_URI[libtest-mimic-0.7.3.sha256sum] = "cc0bda45ed5b3a2904262c1bb91e526127aa70e7ef3758aba2ef93cf896b9b58"
SRC_URI[linked-hash-map-0.5.6.sha256sum] = "0717cef1bc8b636c6e1c1bbdefc09e6322da8a9321966e8928ef80d20f7f770f"
SRC_URI[linux-raw-sys-0.4.15.sha256sum] = "d26c52dbd32dccf2d10cac7725f8eae5296885fb5703b261f7d0a0739ec807ab"
SRC_URI[linux-raw-sys-0.9.3.sha256sum] = "fe7db12097d22ec582439daf8618b8fdd1a7bef6270e9af3b1ebcd30893cf413"
SRC_URI[litemap-0.7.5.sha256sum] = "23fb14cb19457329c82206317a5663005a4d404783dc74f4252769b0d5f42856"
SRC_URI[lock_api-0.4.12.sha256sum] = "07af8b9cdd281b7915f413fa73f29ebd5d55d0d3f0155584dade1ff18cea1b17"
SRC_URI[log-0.4.27.sha256sum] = "13dc2df351e3202783a1fe0d44375f7295ffb4049267b0f3018346dc122a1d94"
SRC_URI[loom-0.7.2.sha256sum] = "419e0dc8046cb947daa77eb95ae174acfbddb7673b4151f56d1eed8e93fbfaca"
SRC_URI[lsp-server-0.7.8.sha256sum] = "9462c4dc73e17f971ec1f171d44bfffb72e65a130117233388a0ebc7ec5656f9"
SRC_URI[matchers-0.1.0.sha256sum] = "8263075bb86c5a1b1427b5ae862e8889656f126e9f77c484496e8b47cf5c5558"
SRC_URI[matches-0.1.10.sha256sum] = "2532096657941c2fea9c289d370a250971c689d4f143798ff67113ec042024a5"
SRC_URI[matchit-0.8.6.sha256sum] = "2f926ade0c4e170215ae43342bf13b9310a437609c81f29f86c5df6657582ef9"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[mimalloc-0.1.46.sha256sum] = "995942f432bbb4822a7e9c3faa87a695185b0d09273ba85f097b54f4e458f2af"
SRC_URI[minicov-0.3.7.sha256sum] = "f27fe9f1cc3c22e1687f9446c2083c4c5fc7f0bcf1c7a86bdbded14985895b4b"
SRC_URI[minimal-lexical-0.2.1.sha256sum] = "68354c5c6bd36d73ff3feceb05efa59b6acb7626617f4962be322a825e61f79a"
SRC_URI[miniz_oxide-0.8.5.sha256sum] = "8e3e04debbb59698c15bacbb6d93584a8c0ca9cc3213cb423d31f760d8843ce5"
SRC_URI[mio-1.0.3.sha256sum] = "2886843bf800fba2e3377cff24abf6379b4c4d5c6681eaf9ea5b0d15090450bd"
SRC_URI[natord-1.0.9.sha256sum] = "308d96db8debc727c3fd9744aac51751243420e46edf401010908da7f8d5e57c"
SRC_URI[newtype-uuid-1.2.1.sha256sum] = "ee3224f0e8be7c2a1ebc77ef9c3eecb90f55c6594399ee825de964526b3c9056"
SRC_URI[nix-0.29.0.sha256sum] = "71e2746dc3a24dd78b3cfcb7be93368c6de9963d30f43a6a73998a9cf4b17b46"
SRC_URI[nom-7.1.3.sha256sum] = "d273983c5a657a70a3e8f2a01329822f3b8c8172b73826411a55751e404a0a4a"
SRC_URI[normalize-line-endings-0.3.0.sha256sum] = "61807f77802ff30975e01f4f071c8ba10c022052f98b3294119f3e615d13e5be"
SRC_URI[notify-8.0.0.sha256sum] = "2fee8403b3d66ac7b26aee6e40a897d85dc5ce26f44da36b8b73e987cc52e943"
SRC_URI[notify-types-2.0.0.sha256sum] = "5e0826a989adedc2a244799e823aece04662b66609d96af8dff7ac6df9a8925d"
SRC_URI[nu-ansi-term-0.46.0.sha256sum] = "77a8165726e8236064dbb45459242600304b42a5ea24ee2948e18e023bf7ba84"
SRC_URI[nu-ansi-term-0.50.1.sha256sum] = "d4a28e057d01f97e61255210fcff094d74ed0466038633e95017f5beb68e4399"
SRC_URI[num-traits-0.2.19.sha256sum] = "071dfc062690e90b734c0b2273ce72ad0ffa95f0c74596bc250dcfd960262841"
SRC_URI[num_cpus-1.16.0.sha256sum] = "4161fcb6d602d4d2081af7c3a45852d875a03dd337a6bfdd6e06407b61342a43"
SRC_URI[number_prefix-0.4.0.sha256sum] = "830b246a0e5f20af87141b25c173cd1b609bd7779a4617d6ec582abaf90870f3"
SRC_URI[once_cell-1.21.1.sha256sum] = "d75b0bedcc4fe52caa0e03d9f1151a323e4aa5e2d78ba3580400cd3c9e2bc4bc"
SRC_URI[oorandom-11.1.5.sha256sum] = "d6790f58c7ff633d8771f42965289203411a5e5c68388703c06e14f24770b41e"
SRC_URI[option-ext-0.2.0.sha256sum] = "04744f49eae99ab78e0d5c0b603ab218f515ea8cfe5a456d7629ad883a3b6e7d"
SRC_URI[ordermap-0.5.7.sha256sum] = "7d31b8b7a99f71bdff4235faf9ce9eada0ad3562c8fbeb7d607d9f41a6ec569d"
SRC_URI[os_pipe-1.2.1.sha256sum] = "5ffd2b0a5634335b135d5728d84c5e0fd726954b87111f7506a61c502280d982"
SRC_URI[os_str_bytes-7.1.0.sha256sum] = "c86e2db86dd008b4c88c77a9bb83d9286bf77204e255bb3fda3b2eebcae66b62"
SRC_URI[overload-0.1.1.sha256sum] = "b15813163c1d831bf4a13c3610c05c0d03b39feb07f7e09fa234dac9b15aaf39"
SRC_URI[parking_lot-0.12.3.sha256sum] = "f1bf18183cf54e8d6059647fc3063646a1801cf30896933ec2311622cc4b9a27"
SRC_URI[parking_lot_core-0.9.10.sha256sum] = "1e401f977ab385c9e4e3ab30627d6f26d00e2c73eef317493c4ec6d468726cf8"
SRC_URI[paste-1.0.15.sha256sum] = "57c0d7b74b563b49d38dae00a0c37d4d6de9b432382b2892f0574ddcae73fd0a"
SRC_URI[path-absolutize-3.1.1.sha256sum] = "e4af381fe79fa195b4909485d99f73a80792331df0625188e707854f0b3383f5"
SRC_URI[path-dedot-3.1.1.sha256sum] = "07ba0ad7e047712414213ff67533e6dd477af0a4e1d14fb52343e53d30ea9397"
SRC_URI[path-slash-0.2.1.sha256sum] = "1e91099d4268b0e11973f036e885d652fb0b21fedcf69738c627f94db6a44f42"
SRC_URI[pathdiff-0.2.3.sha256sum] = "df94ce210e5bc13cb6651479fa48d14f601d9858cfe0467f43ae157023b938d3"
SRC_URI[peg-0.8.5.sha256sum] = "9928cfca101b36ec5163e70049ee5368a8a1c3c6efc9ca9c5f9cc2f816152477"
SRC_URI[peg-macros-0.8.5.sha256sum] = "6298ab04c202fa5b5d52ba03269fb7b74550b150323038878fe6c372d8280f71"
SRC_URI[peg-runtime-0.8.5.sha256sum] = "132dca9b868d927b35b5dd728167b2dee150eb1ad686008fc71ccb298b776fca"
SRC_URI[pep440_rs-0.7.3.sha256sum] = "31095ca1f396e3de32745f42b20deef7bc09077f918b085307e8eab6ddd8fb9c"
SRC_URI[pep508_rs-0.9.2.sha256sum] = "faee7227064121fcadcd2ff788ea26f0d8f2bd23a0574da11eca23bc935bcc05"
SRC_URI[percent-encoding-2.3.1.sha256sum] = "e3148f5046208a5d56bcfc03053e3ca6334e51da8dfb19b6cdc8b306fae3283e"
SRC_URI[pest-2.7.15.sha256sum] = "8b7cafe60d6cf8e62e1b9b2ea516a089c008945bb5a275416789e7db0bc199dc"
SRC_URI[pest_derive-2.7.15.sha256sum] = "816518421cfc6887a0d62bf441b6ffb4536fcc926395a69e1a85852d4363f57e"
SRC_URI[pest_generator-2.7.15.sha256sum] = "7d1396fd3a870fc7838768d171b4616d5c91f6cc25e377b673d714567d99377b"
SRC_URI[pest_meta-2.7.15.sha256sum] = "e1e58089ea25d717bfd31fb534e4f3afcc2cc569c70de3e239778991ea3b7dea"
SRC_URI[phf-0.11.3.sha256sum] = "1fd6780a80ae0c52cc120a26a1a42c1ae51b247a253e4e06113d23d2c2edd078"
SRC_URI[phf_codegen-0.11.3.sha256sum] = "aef8048c789fa5e851558d709946d6d79a8ff88c0440c587967f8e94bfb1216a"
SRC_URI[phf_generator-0.11.3.sha256sum] = "3c80231409c20246a13fddb31776fb942c38553c51e871f8cbd687a4cfb5843d"
SRC_URI[phf_shared-0.11.3.sha256sum] = "67eabc2ef2a60eb7faa00097bd1ffdb5bd28e62bf39990626a582201b7a754e5"
SRC_URI[pin-project-1.1.10.sha256sum] = "677f1add503faace112b9f1373e43e9e054bfdd22ff1a63c1bc485eaec6a6a8a"
SRC_URI[pin-project-internal-1.1.10.sha256sum] = "6e918e4ff8c4549eb882f14b3a4bc8c8bc93de829416eacf579f1207a8fbf861"
SRC_URI[pin-project-lite-0.2.16.sha256sum] = "3b3cff922bd51709b605d9ead9aa71031d81447142d828eb4a6eba76fe619f9b"
SRC_URI[pkg-config-0.3.32.sha256sum] = "7edddbd0b52d732b21ad9a5fab5c704c14cd949e5e9a1ec5929a24fded1b904c"
SRC_URI[portable-atomic-1.11.0.sha256sum] = "350e9b48cbc6b0e028b0473b114454c6316e57336ee184ceab6e53f72c178b3e"
SRC_URI[portable-atomic-util-0.2.4.sha256sum] = "d8a2f0d8d040d7848a709caf78912debcc3f33ee4b3cac47d73d1e1069e83507"
SRC_URI[ppv-lite86-0.2.21.sha256sum] = "85eae3c4ed2f50dcfe72643da4befc30deadb458a9b590d720cde2f2b1e97da9"
SRC_URI[predicates-3.1.3.sha256sum] = "a5d19ee57562043d37e82899fade9a22ebab7be9cef5026b07fda9cdd4293573"
SRC_URI[predicates-core-1.0.9.sha256sum] = "727e462b119fe9c93fd0eb1429a5f7647394014cf3c04ab2c0350eeb09095ffa"
SRC_URI[predicates-tree-1.0.12.sha256sum] = "72dd2d6d381dfb73a193c7fca536518d7caee39fc8503f74e7dc0be0531b425c"
SRC_URI[pretty_assertions-1.4.1.sha256sum] = "3ae130e2f271fbc2ac3a40fb1d07180839cdbbe443c7a27e1e3c13c5cac0116d"
SRC_URI[proc-macro2-1.0.95.sha256sum] = "02b3e5e68a3a1a02aad3ec490a98007cbc13c37cbe84a3cd7b8e406d76e7f778"
SRC_URI[pyproject-toml-0.13.4.sha256sum] = "643af57c3f36ba90a8b53e972727d8092f7408a9ebfbaf4c3d2c17b07c58d835"
SRC_URI[quick-junit-0.5.1.sha256sum] = "3ed1a693391a16317257103ad06a88c6529ac640846021da7c435a06fffdacd7"
SRC_URI[quick-xml-0.37.2.sha256sum] = "165859e9e55f79d67b96c5d96f4e88b6f2695a1972849c15a6a3f5c59fc2c003"
SRC_URI[quickcheck-1.0.3.sha256sum] = "588f6378e4dd99458b60ec275b4477add41ce4fa9f64dcba6f15adccb19b50d6"
SRC_URI[quickcheck_macros-1.0.0.sha256sum] = "b22a693222d716a9587786f37ac3f6b4faedb5b80c23914e7303ff5a1d8016e9"
SRC_URI[quote-1.0.40.sha256sum] = "1885c039570dc00dcb4ff087a89e185fd56bae234ddc7f056a945bf36467248d"
SRC_URI[r-efi-5.2.0.sha256sum] = "74765f6d916ee2faa39bc8e68e4f3ed8949b48cccdac59983d287a7cb71ce9c5"
SRC_URI[rand-0.8.5.sha256sum] = "34af8d1a0e25924bc5b7c43c079c942339d8f0a8b57c39049bef581b46327404"
SRC_URI[rand-0.9.1.sha256sum] = "9fbfd9d094a40bf3ae768db9361049ace4c0e04a4fd6b359518bd7b73a73dd97"
SRC_URI[rand_chacha-0.3.1.sha256sum] = "e6c10a63a0fa32252be49d21e7709d4d4baf8d231c2dbce1eaa8141b9b127d88"
SRC_URI[rand_chacha-0.9.0.sha256sum] = "d3022b5f1df60f26e1ffddd6c66e8aa15de382ae63b3a0c1bfc0e4d3e3f325cb"
SRC_URI[rand_core-0.6.4.sha256sum] = "ec0be4795e2f6a28069bec0b5ff3e2ac9bafc99e6a9a7dc3547996c5c816922c"
SRC_URI[rand_core-0.9.3.sha256sum] = "99d9a13982dcf210057a8a78572b2217b667c3beacbf3a0d8b454f6f82837d38"
SRC_URI[rayon-1.10.0.sha256sum] = "b418a60154510ca1a002a752ca9714984e21e4241e804d32555251faf8b78ffa"
SRC_URI[rayon-core-1.12.1.sha256sum] = "1465873a3dfdaa8ae7cb14b4383657caab0b3e8a0aa9ae8e04b044854c8dfce2"
SRC_URI[redox_syscall-0.5.10.sha256sum] = "0b8c0c260b63a8219631167be35e6a988e9554dbd323f8bd08439c8ed1302bd1"
SRC_URI[redox_users-0.4.6.sha256sum] = "ba009ff324d1fc1b900bd1fdb31564febe58a8ccc8a6fdbb93b543d33b13ca43"
SRC_URI[regex-1.11.1.sha256sum] = "b544ef1b4eac5dc2db33ea63606ae9ffcfac26c1416a2806ae0bf5f56b201191"
SRC_URI[regex-automata-0.1.10.sha256sum] = "6c230d73fb8d8c1b9c0b3135c5142a8acee3a0558fb8db5cf1cb65f8d7862132"
SRC_URI[regex-automata-0.4.9.sha256sum] = "809e8dc61f6de73b46c85f4c96486310fe304c434cfa43669d7b40f711150908"
SRC_URI[regex-syntax-0.6.29.sha256sum] = "f162c6dd7b008981e4d40210aca20b4bd0f9b60ca9271061b07f78537722f2e1"
SRC_URI[regex-syntax-0.8.5.sha256sum] = "2b15c43186be67a4fd63bee50d0303afffcef381492ebe2c5d87f324e1b8815c"
SRC_URI[ron-0.7.1.sha256sum] = "88073939a61e5b7680558e6be56b419e208420c2adb92be54921fa6b72283f1a"
SRC_URI[rust-stemmers-1.2.0.sha256sum] = "e46a2036019fdb888131db7a4c847a1063a7493f971ed94ea82c67eada63ca54"
SRC_URI[rustc-hash-1.1.0.sha256sum] = "08d43f7aa6b08d49f382cde6a7982047c3426db949b1424bc4b7ec9ae12c6ce2"
SRC_URI[rustc-hash-2.1.1.sha256sum] = "357703d41365b4b27c590e3ed91eabb1b663f07c4c084095e60cbed4362dff0d"
SRC_URI[rustix-0.38.44.sha256sum] = "fdb5bc1ae2baa591800df16c9ca78619bf65c0488b41b96ccec5d11220d8c154"
SRC_URI[rustix-1.0.2.sha256sum] = "f7178faa4b75a30e269c71e61c353ce2748cf3d76f0c44c393f4e60abf49b825"
SRC_URI[rustversion-1.0.20.sha256sum] = "eded382c5f5f786b989652c49544c4877d9f015cc22e145a5ea8ea66c2921cd2"
SRC_URI[ryu-1.0.20.sha256sum] = "28d3b2b1366ec20994f1fd18c3c594f05c5dd4bc44d8bb0c1c632c8d6829481f"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schemars-0.8.22.sha256sum] = "3fbf2ae1b8bc8e02df939598064d22402220cd5bbcca1c76f7d6a310974d5615"
SRC_URI[schemars_derive-0.8.22.sha256sum] = "32e265784ad618884abaea0600a9adf15393368d840e0222d101a072f3f7534d"
SRC_URI[scoped-tls-1.0.1.sha256sum] = "e1cf6437eb19a8f4a6cc0f7dca544973b0b78843adbfeb3683d1a94a0024a294"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[seahash-4.1.0.sha256sum] = "1c107b6f4780854c8b126e228ea8869f4d7b71260f962fefb57b996b8959ba6b"
SRC_URI[serde-1.0.219.sha256sum] = "5f0e2c6ed6606019b4e29e69dbaba95b11854410e5347d525002456dbbb786b6"
SRC_URI[serde-wasm-bindgen-0.6.5.sha256sum] = "8302e169f0eddcc139c70f139d19d6467353af16f9fce27e8c30158036a1e16b"
SRC_URI[serde_derive-1.0.219.sha256sum] = "5b0276cf7f2c73365f7157c8123c21cd9a50fbbd844757af28ca1f5925fc2a00"
SRC_URI[serde_derive_internals-0.29.1.sha256sum] = "18d26a20a969b9e3fdf2fc2d9f21eda6c40e2de84c9408bb5d3b05d499aae711"
SRC_URI[serde_json-1.0.140.sha256sum] = "20068b6e96dc6c9bd23e01df8827e6c7e1f2fddd43c21810382803c136b99373"
SRC_URI[serde_repr-0.1.20.sha256sum] = "175ee3e80ae9982737ca543e96133087cbd9a485eecc3bc4de9c1a37b47ea59c"
SRC_URI[serde_spanned-0.6.8.sha256sum] = "87607cb1398ed59d48732e575a4c28a7a8ebf2454b964fe3f224f2afc07909e1"
SRC_URI[serde_test-1.0.177.sha256sum] = "7f901ee573cab6b3060453d2d5f0bae4e6d628c23c0a962ff9b5f1d7c8d4f1ed"
SRC_URI[serde_with-3.12.0.sha256sum] = "d6b6f7f2fcb69f747921f79f3926bd1e203fce4fef62c268dd3abfb6d86029aa"
SRC_URI[serde_with_macros-3.12.0.sha256sum] = "8d00caa5193a3c8362ac2b73be6b9e768aa5a4b2f721d8f4b339600c3cb51f8e"
SRC_URI[sha2-0.10.8.sha256sum] = "793db75ad2bcafc3ffa7c68b215fee268f537982cd901d132f89c6343f3a3dc8"
SRC_URI[sharded-slab-0.1.7.sha256sum] = "f40ca3c46823713e0d4209592e8d6e826aa57e928f09752619fc696c499637f6"
SRC_URI[shellexpand-3.1.1.sha256sum] = "8b1fdf65dd6331831494dd616b30351c38e96e45921a27745cf98490458b90bb"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[similar-2.7.0.sha256sum] = "bbbb5d9659141646ae647b42fe094daf6c6192d1620870b449d9557f748b2daa"
SRC_URI[siphasher-1.0.1.sha256sum] = "56199f7ddabf13fe5074ce809e7d3f42b42ae711800501b5b16ea82ad029c39d"
SRC_URI[smallvec-1.15.0.sha256sum] = "8917285742e9f3e1683f0a9c4e6b57960b7314d0b08d30d1ecd426713ee2eee9"
SRC_URI[snapbox-0.6.21.sha256sum] = "96dcfc4581e3355d70ac2ee14cfdf81dce3d85c85f1ed9e2c1d3013f53b3436b"
SRC_URI[snapbox-macros-0.3.10.sha256sum] = "16569f53ca23a41bb6f62e0a5084aa1661f4814a67fa33696a79073e03a664af"
SRC_URI[stable_deref_trait-1.2.0.sha256sum] = "a8f112729512f8e442d81f95a8a7ddf2b7c6b8a1a6f509a95864142b30cab2d3"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strip-ansi-escapes-0.2.1.sha256sum] = "2a8f8038e7e7969abb3f1b7c2a811225e9296da208539e0f79c5251d6cac0025"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[strum-0.27.1.sha256sum] = "f64def088c51c9510a8579e3c5d67c65349dcf755e5479ad3d010aa6454e2c32"
SRC_URI[strum_macros-0.27.1.sha256sum] = "c77a8c5abcaf0f9ce05d62342b7d298c346515365c36b673df4ebe3ced01fde8"
SRC_URI[syn-1.0.109.sha256sum] = "72b64191b275b66ffe2469e8af2c1cfe3bafa67b529ead792a6d0160888b4237"
SRC_URI[syn-2.0.101.sha256sum] = "8ce2b7fc941b3a24138a0a7cf8e858bfc6a992e7978a068a5c760deb0ed43caf"
SRC_URI[synstructure-0.13.1.sha256sum] = "c8af7666ab7b6390ab78131fb5b0fce11d6b7a6951602017c35fa82800708971"
SRC_URI[tempfile-3.19.1.sha256sum] = "7437ac7763b9b123ccf33c338a5cc1bac6f69b45a136c19bdd8a65e3916435bf"
SRC_URI[termcolor-1.4.1.sha256sum] = "06794f8f6c5c898b3275aebefa6b8a1cb24cd2c6c79397ab15774837a0bc5755"
SRC_URI[terminal_size-0.4.2.sha256sum] = "45c6481c4829e4cc63825e62c49186a34538b7b2750b73b266581ffb612fb5ed"
SRC_URI[terminfo-0.9.0.sha256sum] = "d4ea810f0692f9f51b382fff5893887bb4580f5fa246fde546e0b13e7fcee662"
SRC_URI[termtree-0.5.1.sha256sum] = "8f50febec83f5ee1df3015341d8bd429f2d1cc62bcba7ea2076759d315084683"
SRC_URI[test-case-3.3.1.sha256sum] = "eb2550dd13afcd286853192af8601920d959b14c401fcece38071d53bf0768a8"
SRC_URI[test-case-core-3.3.1.sha256sum] = "adcb7fd841cd518e279be3d5a3eb0636409487998a4aff22f3de87b81e88384f"
SRC_URI[test-case-macros-3.3.1.sha256sum] = "5c89e72a01ed4c579669add59014b9a524d609c0c88c6a585ce37485879f6ffb"
SRC_URI[thin-vec-0.2.14.sha256sum] = "144f754d318415ac792f9d69fc87abbbfc043ce2ef041c60f16ad828f638717d"
SRC_URI[thiserror-1.0.69.sha256sum] = "b6aaf5339b578ea85b50e080feb250a3e8ae8cfcdff9a461c9ec2904bc923f52"
SRC_URI[thiserror-2.0.12.sha256sum] = "567b8a2dae586314f7be2a752ec7474332959c6460e02bde30d702a66d488708"
SRC_URI[thiserror-impl-1.0.69.sha256sum] = "4fee6c4efc90059e10f81e6d42c60a18f76588c3d74cb83a0b242a2b6c7504c1"
SRC_URI[thiserror-impl-2.0.12.sha256sum] = "7f7cf42b4507d8ea322120659672cf1b9dbb93f8f2d4ecfd6e51350ff5b17a1d"
SRC_URI[thread_local-1.1.8.sha256sum] = "8b9ef9bad013ada3808854ceac7b46812a6465ba368859a37e2100283d2d719c"
SRC_URI[threadpool-1.8.1.sha256sum] = "d050e60b33d41c19108b32cea32164033a9013fe3b46cbd4457559bfbf77afaa"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[tikv-jemallocator-0.6.0.sha256sum] = "4cec5ff18518d81584f477e9bfdf957f5bb0979b0bac3af4ca30b5b3ae2d2865"
SRC_URI[tinystr-0.7.6.sha256sum] = "9117f5d4db391c1cf6927e7bea3db74b9a1c1add8f7eda9ffd5364f40f57b82f"
SRC_URI[tinytemplate-1.2.1.sha256sum] = "be4d6b5f19ff7664e8c98d03e2139cb510db9b0a60b55f8e8709b689d939b6bc"
SRC_URI[tinyvec-1.9.0.sha256sum] = "09b3661f17e86524eccd4371ab0429194e0d7c008abb45f7a7495b1719463c71"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[toml-0.8.20.sha256sum] = "cd87a5cdd6ffab733b2f74bc4fd7ee5fff6634124999ac278c35fc78c6120148"
SRC_URI[toml_datetime-0.6.8.sha256sum] = "0dd7358ecb8fc2f8d014bf86f6f638ce72ba252a2c3a2572f2a795f1d23efb41"
SRC_URI[toml_edit-0.22.24.sha256sum] = "17b4795ff5edd201c7cd6dca065ae59972ce77d1b80fa0a84d94950ece7d1474"
SRC_URI[tracing-0.1.41.sha256sum] = "784e0ac535deb450455cbfa28a6f0df145ea1bb7ae51b821cf5e7927fdcfbdd0"
SRC_URI[tracing-attributes-0.1.28.sha256sum] = "395ae124c09f9e6918a2310af6038fba074bcf474ac352496d5910dd59a2226d"
SRC_URI[tracing-core-0.1.33.sha256sum] = "e672c95779cf947c5311f83787af4fa8fffd12fb27e4993211a84bdfd9610f9c"
SRC_URI[tracing-flame-0.2.0.sha256sum] = "0bae117ee14789185e129aaee5d93750abe67fdc5a9a62650452bfe4e122a3a9"
SRC_URI[tracing-indicatif-0.3.9.sha256sum] = "8201ca430e0cd893ef978226fd3516c06d9c494181c8bf4e5b32e30ed4b40aa1"
SRC_URI[tracing-log-0.2.0.sha256sum] = "ee855f1f400bd0e5c02d150ae5de3840039a3f54b025156404e34c23c03f47c3"
SRC_URI[tracing-subscriber-0.3.19.sha256sum] = "e8189decb5ac0fa7bc8b96b7cb9b2701d60d48805aca84a238004d665fcc4008"
SRC_URI[tracing-tree-0.4.0.sha256sum] = "f459ca79f1b0d5f71c54ddfde6debfc59c8b6eeb46808ae492077f739dc7b49c"
SRC_URI[tryfn-0.2.3.sha256sum] = "5fe242ee9e646acec9ab73a5c540e8543ed1b107f0ce42be831e0775d423c396"
SRC_URI[typed-arena-2.0.2.sha256sum] = "6af6ae20167a9ece4bcb41af5b80f8a1f1df981f6391189ce00fd257af04126a"
SRC_URI[typenum-1.18.0.sha256sum] = "1dccffe3ce07af9386bfd29e80c0ab1a8205a2fc34e4bcd40364df902cfa8f3f"
SRC_URI[ucd-trie-0.1.7.sha256sum] = "2896d95c02a80c6d6a5d6e953d479f5ddf2dfdb6a244441010e373ac0fb88971"
SRC_URI[unic-char-property-0.9.0.sha256sum] = "a8c57a407d9b6fa02b4795eb81c5b6652060a15a7903ea981f3d723e6c0be221"
SRC_URI[unic-char-range-0.9.0.sha256sum] = "0398022d5f700414f6b899e10b8348231abf9173fa93144cbc1a43b9793c1fbc"
SRC_URI[unic-common-0.9.0.sha256sum] = "80d7ff825a6a654ee85a63e80f92f054f904f21e7d12da4e22f9834a4aaa35bc"
SRC_URI[unic-ucd-category-0.9.0.sha256sum] = "1b8d4591f5fcfe1bd4453baaf803c40e1b1e69ff8455c47620440b46efef91c0"
SRC_URI[unic-ucd-version-0.9.0.sha256sum] = "96bd2f2237fe450fcd0a1d2f5f4e91711124f7857ba2e964247776ebeeb7b0c4"
SRC_URI[unicode-ident-1.0.18.sha256sum] = "5a5f39404a5da50712a4c1eecf25e90dd62b613502b7e925fd4e4d19b5c96512"
SRC_URI[unicode-normalization-0.1.24.sha256sum] = "5033c97c4262335cded6d6fc3e5c18ab755e1a3dc96376350f3d8e9f009ad956"
SRC_URI[unicode-width-0.1.14.sha256sum] = "7dd6e30e90baa6f72411720665d41d89b9a3d039dc45b8faea1ddd07f617f6af"
SRC_URI[unicode-width-0.2.0.sha256sum] = "1fc81956842c57dac11422a97c3b8195a1ff727f06e85c84ed2e8aa277c9a0fd"
SRC_URI[unicode_names2-1.3.0.sha256sum] = "d1673eca9782c84de5f81b82e4109dcfb3611c8ba0d52930ec4a9478f547b2dd"
SRC_URI[unicode_names2_generator-1.3.0.sha256sum] = "b91e5b84611016120197efd7dc93ef76774f4e084cd73c9fb3ea4a86c570c56e"
SRC_URI[unscanny-0.1.0.sha256sum] = "e9df2af067a7953e9c3831320f35c1cc0600c30d44d9f7a12b01db1cd88d6b47"
SRC_URI[url-2.5.4.sha256sum] = "32f8b686cadd1473f4bd0117a5d28d36b1ade384ea9b5069a1c40aefed7fda60"
SRC_URI[urlencoding-2.1.3.sha256sum] = "daf8dba3b7eb870caf1ddeed7bc9d2a049f3cfdfae7cb521b087cc33ae4c49da"
SRC_URI[utf16_iter-1.0.5.sha256sum] = "c8232dd3cdaed5356e0f716d285e4b40b932ac434100fe9b7e0e8e935b9e6246"
SRC_URI[utf8-width-0.1.7.sha256sum] = "86bd8d4e895da8537e5315b8254664e6b769c4ff3db18321b297a1e7004392e3"
SRC_URI[utf8_iter-1.0.4.sha256sum] = "b6c140620e7ffbb22c2dee59cafe6084a59b5ffc27a8859a5f0d494b5d52b6be"
SRC_URI[utf8parse-0.2.2.sha256sum] = "06abde3611657adf66d383f00b093d7faecc7fa57071cce2578660c9f1010821"
SRC_URI[uuid-1.16.0.sha256sum] = "458f7a779bf54acc9f347480ac654f68407d3aab21269a6e3c9f922acd9e2da9"
SRC_URI[uuid-macro-internal-1.16.0.sha256sum] = "72dcd78c4f979627a754f5522cea6e6a25e55139056535fe6e69c506cd64a862"
SRC_URI[valuable-0.1.1.sha256sum] = "ba73ea9cf16a25df0c8caa16c51acb937d5712a8429db78a3ee29d5dcacd3a65"
SRC_URI[version-ranges-0.1.1.sha256sum] = "f8d079415ceb2be83fc355adbadafe401307d5c309c7e6ade6638e6f9f42f42d"
SRC_URI[version_check-0.9.5.sha256sum] = "0b928f33d975fc6ad9f86c8f283853ad26bdd5b10b7f1542aa2fa15e2289105a"
SRC_URI[vt100-0.15.2.sha256sum] = "84cd863bf0db7e392ba3bd04994be3473491b31e66340672af5d11943c6274de"
SRC_URI[vte-0.11.1.sha256sum] = "f5022b5fbf9407086c180e9557be968742d839e68346af7792b8592489732197"
SRC_URI[vte-0.14.1.sha256sum] = "231fdcd7ef3037e8330d8e17e61011a2c244126acc0a982f4040ac3f9f0bc077"
SRC_URI[vte_generate_state_changes-0.1.2.sha256sum] = "2e369bee1b05d510a7b4ed645f5faa90619e05437111783ea5848f28d97d3c2e"
SRC_URI[wait-timeout-0.2.1.sha256sum] = "09ac3b126d3914f9849036f826e054cbabdc8519970b8998ddaf3b5bd3c65f11"
SRC_URI[walkdir-2.5.0.sha256sum] = "29790946404f91d9c5d06f9874efddea1dc06c5efe94541a7d6863108e3a5e4b"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasi-0.14.2+wasi-0.2.4.sha256sum] = "9683f9a5a998d873c0d21fcbe3c083009670149a8fab228644b8bd36b2c48cb3"
SRC_URI[wasm-bindgen-0.2.100.sha256sum] = "1edc8929d7499fc4e8f0be2262a241556cfc54a0bea223790e71446f2aab1ef5"
SRC_URI[wasm-bindgen-backend-0.2.100.sha256sum] = "2f0a0651a5c2bc21487bde11ee802ccaf4c51935d0d3d42a6101f98161700bc6"
SRC_URI[wasm-bindgen-futures-0.4.50.sha256sum] = "555d470ec0bc3bb57890405e5d4322cc9ea83cebb085523ced7be4144dac1e61"
SRC_URI[wasm-bindgen-macro-0.2.100.sha256sum] = "7fe63fc6d09ed3792bd0897b314f53de8e16568c2b3f7982f468c0bf9bd0b407"
SRC_URI[wasm-bindgen-macro-support-0.2.100.sha256sum] = "8ae87ea40c9f689fc23f209965b6fb8a99ad69aeeb0231408be24920604395de"
SRC_URI[wasm-bindgen-shared-0.2.100.sha256sum] = "1a05d73b933a847d6cccdda8f838a22ff101ad9bf93e33684f39c1f5f0eece3d"
SRC_URI[wasm-bindgen-test-0.3.50.sha256sum] = "66c8d5e33ca3b6d9fa3b4676d774c5778031d27a578c2b007f905acf816152c3"
SRC_URI[wasm-bindgen-test-macro-0.3.50.sha256sum] = "17d5042cc5fa009658f9a7333ef24291b1291a25b6382dd68862a7f3b969f69b"
SRC_URI[web-sys-0.3.77.sha256sum] = "33b6dd2ef9186f1f2072e409e99cd22a975331a6b3591b12c764e0e55c60d5d2"
SRC_URI[web-time-1.1.0.sha256sum] = "5a6580f308b1fad9207618087a65c04e7a10bc77e02c8e84e9b00dd4b12fa0bb"
SRC_URI[which-7.0.2.sha256sum] = "2774c861e1f072b3aadc02f8ba886c26ad6321567ecc294c935434cad06f1283"
SRC_URI[wild-2.2.1.sha256sum] = "a3131afc8c575281e1e80f36ed6a092aa502c08b18ed7524e86fbbb12bb410e1"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.9.sha256sum] = "cf221c93e13a30d793f7645a0e7762c55d169dbb0a49671918a2319d289b10bb"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-0.58.0.sha256sum] = "dd04d41d93c4992d421894c18c8b43496aa748dd4c081bac0dc93eb0489272b6"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-core-0.58.0.sha256sum] = "6ba6d44ec8c2591c134257ce647b7ea6b20335bf6379a27dac5f1641fcf59f99"
SRC_URI[windows-implement-0.58.0.sha256sum] = "2bbd5b46c938e506ecbce286b6628a02171d56153ba733b6c741fc627ec9579b"
SRC_URI[windows-interface-0.58.0.sha256sum] = "053c4c462dc91d3b1504c6fe5a726dd15e216ba718e84a0e46a88fbe5ded3515"
SRC_URI[windows-link-0.1.0.sha256sum] = "6dccfd733ce2b1753b03b6d3c65edf020262ea35e20ccdf3e288043e6dd620e3"
SRC_URI[windows-result-0.2.0.sha256sum] = "1d1043d8214f791817bab27572aaa8af63732e11bf84aa21a45a78d6c317ae0e"
SRC_URI[windows-strings-0.1.0.sha256sum] = "4cd9b125c486025df0eabcb585e62173c6c9eddcec5d117d3b6e8c30e2ee4d10"
SRC_URI[windows-sys-0.48.0.sha256sum] = "677d2418bec65e3338edb076e806bc1ec15693c5d0104683f2efe857f61056a9"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.59.0.sha256sum] = "1e38bc4d79ed67fd075bcc251a1c39b32a1776bbe92e5bef1f0bf1f8c531853b"
SRC_URI[windows-targets-0.48.5.sha256sum] = "9a2fa6e2155d7247be68c096456083145c183cbbbc2764150dda45a87197940c"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows_aarch64_gnullvm-0.48.5.sha256sum] = "2b38e32f0abccf9987a4e3079dfb67dcd799fb61361e53e2882c3cbaf0d905d8"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_msvc-0.48.5.sha256sum] = "dc35310971f3b2dbbf3f0690a219f40e2d9afcf64f9ab7cc1be722937c26b4bc"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_i686_gnu-0.48.5.sha256sum] = "a75915e7def60c94dcef72200b9a8e58e5091744960da64ec734a6c6e9b3743e"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_msvc-0.48.5.sha256sum] = "8f55c233f70c4b27f66c523580f78f1004e8b5a8b659e05a4eb49d4166cca406"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_x86_64_gnu-0.48.5.sha256sum] = "53d40abd2583d23e4718fddf1ebec84dbff8381c07cae67ff7768bbf19c6718e"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnullvm-0.48.5.sha256sum] = "0b7b52767868a23d5bab768e390dc5f5c55825b6d30b86c844ff2dc7414044cc"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_msvc-0.48.5.sha256sum] = "ed94fce61571a4006852b7389a063ab983c02eb1bb37b47f8272ce92d06d9538"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"
SRC_URI[winnow-0.7.4.sha256sum] = "0e97b544156e9bebe1a0ffbc03484fc1ffe3100cbce3ffb17eac35f7cdd7ab36"
SRC_URI[winsafe-0.0.19.sha256sum] = "d135d17ab770252ad95e9a872d365cf3090e3be864a34ab46f48555993efc904"
SRC_URI[wit-bindgen-rt-0.39.0.sha256sum] = "6f42320e61fe2cfd34354ecb597f86f413484a798ba44a8ca1165c58d42da6c1"
SRC_URI[write16-1.0.0.sha256sum] = "d1890f4022759daae28ed4fe62859b1236caebfc61ede2f63ed4e695f3f6d936"
SRC_URI[writeable-0.5.5.sha256sum] = "1e9df38ee2d2c3c5948ea468a8406ff0db0b29ae1ffde1bcf20ef305bcc95c51"
SRC_URI[yansi-1.0.1.sha256sum] = "cfe53a6657fd280eaa890a3bc59152892ffa3e30101319d168b781ed6529b049"
SRC_URI[yoke-0.7.5.sha256sum] = "120e6aef9aa629e3d4f52dc8cc43a015c7724194c97dfaf45180d2daf2b77f40"
SRC_URI[yoke-derive-0.7.5.sha256sum] = "2380878cad4ac9aac1e2435f3eb4020e8374b5f13c296cb75b4620ff8e229154"
SRC_URI[zerocopy-0.8.23.sha256sum] = "fd97444d05a4328b90e75e503a34bad781f14e28a823ad3557f0750df1ebcbc6"
SRC_URI[zerocopy-derive-0.8.23.sha256sum] = "6352c01d0edd5db859a63e2605f4ea3183ddbd15e2c4a9e7d32184df75e4f154"
SRC_URI[zerofrom-0.1.6.sha256sum] = "50cc42e0333e05660c3587f3bf9d0478688e15d870fab3346451ce7f8c9fbea5"
SRC_URI[zerofrom-derive-0.1.6.sha256sum] = "d71e5d6e06ab090c67b5e44993ec16b72dcbaabc526db883a360057678b48502"
SRC_URI[zerovec-0.10.4.sha256sum] = "aa2b893d79df23bfb12d5461018d408ea19dfafe76c2c7ef6d4eba614f8ff079"
SRC_URI[zerovec-derive-0.10.3.sha256sum] = "6eafa6dfb17584ea3e2bd6e76e0cc15ad7af12b09abdd1ca55961bed9b1063c6"
SRC_URI[zip-0.6.6.sha256sum] = "760394e246e4c28189f19d488c058bf16f564016aefac5d32bb1f3b51d5e9261"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.14+zstd.1.5.7.sha256sum] = "8fb060d4926e4ac3a3ad15d864e99ceb5f343c6b34f5bd6d81ae6ed417311be5"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasi-0.14.2+wasi-0.2.4.sha256sum] = "9683f9a5a998d873c0d21fcbe3c083009670149a8fab228644b8bd36b2c48cb3"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.14+zstd.1.5.7.sha256sum] = "8fb060d4926e4ac3a3ad15d864e99ceb5f343c6b34f5bd6d81ae6ed417311be5"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasi-0.13.3+wasi-0.2.2.sha256sum] = "26816d2e1a4a36a2940b96c5296ce403917633dff8f3440e9b236ed6f6bacad2"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.14+zstd.1.5.7.sha256sum] = "8fb060d4926e4ac3a3ad15d864e99ceb5f343c6b34f5bd6d81ae6ed417311be5"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[wasi-0.13.3+wasi-0.2.2.sha256sum] = "26816d2e1a4a36a2940b96c5296ce403917633dff8f3440e9b236ed6f6bacad2"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.13+zstd.1.5.6.sha256sum] = "38ff0f21cfee8f97d94cef41359e0c89aa6113028ab0291aa8ca0038995a95aa"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.13+zstd.1.5.6.sha256sum] = "38ff0f21cfee8f97d94cef41359e0c89aa6113028ab0291aa8ca0038995a95aa"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.6.0+5.3.0-1-ge13ca993e8ccb9ba9847cc330696e02839f328f7.sha256sum] = "cd3c60906412afa9c2b5b5a48ca6a5abe5736aec9eb48ad05037a677e52e4e2d"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"
SRC_URI[zstd-0.11.2+zstd.1.5.2.sha256sum] = "20cc960326ece64f010d2d2107537f26dc589a6573a316bd5b1dba685fa5fde4"
SRC_URI[zstd-safe-5.0.2+zstd.1.5.2.sha256sum] = "1d2a5585e04f9eea4b2a3d1eca508c4dee9592a89ef6f450c11719da0726f4db"
SRC_URI[zstd-sys-2.0.11+zstd.1.5.6.sha256sum] = "75652c55c0b6f3e6f12eb786fe1bc960396bf05a1eb3bf1f3691c3610ac2e6d4"
SRC_URI[tikv-jemalloc-sys-0.5.4+5.3.0-patched.sha256sum] = "9402443cb8fd499b6f327e40565234ff34dbda27460c5b47db0db77443dd85d1"
SRC_URI[wasi-0.11.0+wasi-snapshot-preview1.sha256sum] = "9c8d87e72b64a3b4db28d11ce29237c246188f4f51057d65a7eab63b7987e423"

SRCREV_FORMAT = "--astral-sh-lsp-types.git--salsa-rs-salsa.git"
inherit sca-description
inherit cargo-fixups
inherit pypi
inherit python_maturin
inherit_defer native

# until we figured out how to trick cargo from bitbake
# to NOT ******** attempt to refresh git dependencies
# we need to enable networking in compile
do_compile[network] = "1"

SRC_URI:append = " ${CRATES_LIST}"

SCA_TOOL_DESCRIPTION = "ruff"

INSANE_SKIP:${PN} += "already-stripped"
