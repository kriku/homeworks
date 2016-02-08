(TeX-add-style-hook
 "HW2"
 (lambda ()
   (TeX-add-to-alist 'LaTeX-provided-class-options
                     '(("article" "a4paper" "11pt")))
   (TeX-add-to-alist 'LaTeX-provided-package-options
                     '(("xcolor" "dvipsnames")))
   (add-to-list 'LaTeX-verbatim-environments-local "lstlisting")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "lstinline")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "path")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "url")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "nolinkurl")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperbaseurl")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperimage")
   (add-to-list 'LaTeX-verbatim-macros-with-braces-local "hyperref")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "lstinline")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "path")
   (add-to-list 'LaTeX-verbatim-macros-with-delims-local "url")
   (TeX-run-style-hooks
    "latex2e"
    "article"
    "art11"
    "xcolor"
    "svg"
    "amsmath"
    "indentfirst"
    "listings"
    "tabularx"
    "hyperref"
    "wrapfig")
   (LaTeX-add-labels
    "sub:Logic"
    "sec:Glossary"
    "sec:Product Description"
    "sub:User Roles"
    "sub:High Level Software Features"
    "sub:User Stories for Functional Requirements"
    "sub:Mock-up of the User Interface"
    "sub:Non-Functional Requirements / Quality Attributes"
    "sub:Software Constraints")
   (LaTeX-add-array-newcolumntypes
    "Y"
    "C"
    "R")))

